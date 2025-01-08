package com.anju.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anju.demo.model.Employee;
import com.anju.demo.stub.Employee.AllEmployeeRequest;
import com.anju.demo.stub.Employee.AllEmployeeResponse;
import com.anju.demo.stub.Employee.EmployeeRequest;
import com.anju.demo.stub.Employee.EmployeeResponse;
import com.anju.demo.stub.Employee.IsAnEmployeeResponse;
import com.anju.demo.stub.EmployeeServiceGrpc;
import com.anju.demo.stub.EmployeeServiceGrpc.EmployeeServiceBlockingStub;
import com.anju.demo.stub.EmployeeServiceGrpc.EmployeeServiceFutureStub;
import com.anju.demo.stub.EmployeeServiceGrpc.EmployeeServiceStub;
import com.google.common.util.concurrent.ListenableFuture;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

/*
 * http://localhost:9057/grpc/getEmployee?id=5
 * http://localhost:9057/grpc/getAllEmployee
 * http://localhost:9057/grpc/isAnEmployee?id=3  -- async
 * */

@RestController
@RequestMapping("/grpc")
public class GrpcControllerMicroClient {
	
	//to map grpc response to model class -> dependency + ModelMapperFromGrpcResponseToModel.java
	@Autowired
	ModelMapper modelMapper;
	
	public static final Logger log = org.slf4j.LoggerFactory.getLogger(GrpcControllerMicroClient.class);
	private ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9058).usePlaintext().build();
	private EmployeeServiceBlockingStub empBlockingStub = EmployeeServiceGrpc.newBlockingStub(channel);
	private EmployeeServiceStub empAsyncStub = EmployeeServiceGrpc.newStub(channel);
	private EmployeeServiceFutureStub empFutureStub = EmployeeServiceGrpc.newFutureStub(channel);
	
	@RequestMapping("/getEmployee")
	public Employee getEmployee(@RequestParam("id") Integer empId) {
		log.info("Employee detail requested for empId ->"+empId);
		
		EmployeeRequest empRequest = EmployeeRequest.newBuilder().setEmpId(empId).build();
		EmployeeResponse empResponse = empBlockingStub.getAnEmployee(empRequest);
		
		return modelMapper.map(empResponse, Employee.class);
	}
	
	@RequestMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		log.info("All Employee detail requested");
		
		AllEmployeeRequest empRequest = AllEmployeeRequest.newBuilder().build();
		AllEmployeeResponse empResponse = empBlockingStub.getAllEmployees(empRequest);
		
		List<Employee> empList = new ArrayList();
		empResponse.getEmployeeList().forEach(emp -> {
			empList.add(modelMapper.map(emp, Employee.class));
		});
		return empList;
	}
	
	@RequestMapping("/isAnEmployee")
	public void isEmployee(@RequestParam("id") Integer empId) {
		/**
		 * Make asynchronous communication using stub
		 * See the result in console...
		 * */
		log.info("Check for an Employee requested (async + stub), empId ->"+ empId);
		EmployeeRequest empRequest = EmployeeRequest.newBuilder().setEmpId(empId).build();
		StreamObserver<IsAnEmployeeResponse> responseObserver = new StreamObserver<IsAnEmployeeResponse>() {
		
			@Override
			public void onNext(IsAnEmployeeResponse response) {
				System.out.println(response.getIsAnEmployee());
			}

			@Override
			public void onError(Throwable t) {
				log.info("Error happened in processing the request...");
			}

			@Override
			public void onCompleted() {
				System.out.println("Request completed..");
			}
			
		};
		empAsyncStub.isAnEmployeeAsync(empRequest, responseObserver);
	}
	
	@RequestMapping("/isAnEmployeeAsync")
	public void isEmployeeAsync(@RequestParam("id") Integer empId) {
		/**
		 * Make asynchronous communication using future stub
		 * See the result in console...
		 * */
		log.info("Check for an Employee requested (async+ future stub), empId ->"+ empId);
		Boolean result;
		EmployeeRequest empRequest = EmployeeRequest.newBuilder().setEmpId(empId).build();
		
		ListenableFuture<IsAnEmployeeResponse> futureResponse = empFutureStub.isAnEmployeeAsync(empRequest);
		futureResponse.addListener(() -> {
			try {
				IsAnEmployeeResponse response = futureResponse.get();
				System.out.println("Got response as -> "+ response.getIsAnEmployee());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}, Runnable::run);

	}
}
