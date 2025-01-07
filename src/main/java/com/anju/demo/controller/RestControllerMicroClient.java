package com.anju.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.anju.demo.model.Employee;

/**
 * Microservice End Point Provider - 9057
 * */

/**
 * http://localhost:9057/isEmployee/3
 * http://localhost:9057/getEmployee?id=2
 * 
 * Using Hibernate
 * http://localhost:9057/getEmployeeUsingHibernate
 * http://localhost:9057/saveEmployeeUsingHibernate
 * http://localhost:9057/getAnEmployeeUsingHibernate?empId=1
 * http://localhost:9057/updateEmployeeUsingHibernate
 * http://localhost:9057/deleteEmployeeUsingHibernate?empId=1
 * */

@RestController
@RequestMapping("")
public class RestControllerMicroClient {
	@Autowired
	private RestTemplate restTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(RestControllerMicroClient.class) ;
	
	private String baseUrl = "http://localhost:9056/";
	private String requestUrl;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello.. ";
	}
	
	/**
	 * Using Spring Data
	 * */
	@GetMapping("/isEmployee/{id}")
	public ResponseEntity<Boolean> isEmployee(@PathVariable("id") Integer empId) {
		requestUrl = baseUrl + "/isEmployee/"+empId;
		return restTemplate.getForEntity(requestUrl, Boolean.class);
	}
	
	@GetMapping("/getEmployee")
	public Employee getEmployee(@RequestParam("id") Integer empId) {
		requestUrl = baseUrl + "/getEmployee?empId="+empId;
		Employee emp = restTemplate.getForObject(requestUrl, Employee.class);
		return emp;
	}
	
	/*************
	 * end; Using Spring Data
	 * */
	
	//Using Hibernate ..........................................
	@GetMapping("/getEmployeeUsingHibernate")
	public List<Employee> getEmployeeUsingHibernate() {
		requestUrl = baseUrl + "/getEmployeeUsingHibernate";
		Employee[] employees = restTemplate.getForObject(requestUrl, Employee[].class);
	    return Arrays.asList(employees);
	}
	
	@PostMapping("/saveEmployeeUsingHibernate")
	public String saveEmployeeUsingHibernate(@RequestBody Employee emp) {
		requestUrl = baseUrl + "/saveEmployeeUsingHibernate";
		Boolean response = restTemplate.postForObject(requestUrl, emp, Boolean.class);
		if(response) return "Save successfully..";
		else {
			log.error("Couldn't save..");
			return "Couldnot save..";
		}
	}
	
	@GetMapping("/getAnEmployeeUsingHibernate")
	public Employee getAnEmployeeUsingHibernate(@RequestParam("empId") Integer empId) {
		log.info("Requested 'getAnEmployeeUsingHibernate' for "+empId);
		requestUrl = baseUrl +"/getAnEmployeeUsingHibernate?empId=" +empId;
		ResponseEntity<Employee> response = restTemplate.getForEntity(requestUrl, Employee.class);
		return response.getBody();
	}
	
	@PutMapping("/updateEmployeeUsingHibernate")
	public String updateEmployeeUsingHibernate(@RequestBody Employee emp) {
		log.info("Requested 'updateEmployeeUsingHibernate' for "+emp.getEmpId());
		requestUrl = baseUrl + "/updateEmployeeUsingHibernate";
		restTemplate.put(requestUrl, emp);
		return "Updated Successfully..";
	}
	
	@DeleteMapping("/deleteEmployeeUsingHibernate")
	public String deleteEmployeeUsingHibernate(@RequestParam Integer empId) {
		log.info("Requested deleteEmployeeUsingHibernate for "+empId);
		requestUrl = baseUrl + "/deleteEmployeeUsingHibernate?empId="+empId;
		restTemplate.delete(requestUrl);
		return "Deleted successfully..";
	}
	//end; Using Hibernate ..........................................
}
