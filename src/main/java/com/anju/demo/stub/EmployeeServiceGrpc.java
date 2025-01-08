package com.anju.demo.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Employee.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.anju.demo.stub.Employee.EmployeeRequest,
      com.anju.demo.stub.Employee.EmployeeResponse> getGetAnEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnEmployee",
      requestType = com.anju.demo.stub.Employee.EmployeeRequest.class,
      responseType = com.anju.demo.stub.Employee.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anju.demo.stub.Employee.EmployeeRequest,
      com.anju.demo.stub.Employee.EmployeeResponse> getGetAnEmployeeMethod() {
    io.grpc.MethodDescriptor<com.anju.demo.stub.Employee.EmployeeRequest, com.anju.demo.stub.Employee.EmployeeResponse> getGetAnEmployeeMethod;
    if ((getGetAnEmployeeMethod = EmployeeServiceGrpc.getGetAnEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetAnEmployeeMethod = EmployeeServiceGrpc.getGetAnEmployeeMethod) == null) {
          EmployeeServiceGrpc.getGetAnEmployeeMethod = getGetAnEmployeeMethod = 
              io.grpc.MethodDescriptor.<com.anju.demo.stub.Employee.EmployeeRequest, com.anju.demo.stub.Employee.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "getAnEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anju.demo.stub.Employee.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anju.demo.stub.Employee.EmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getAnEmployee"))
                  .build();
          }
        }
     }
     return getGetAnEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anju.demo.stub.Employee.AllEmployeeRequest,
      com.anju.demo.stub.Employee.AllEmployeeResponse> getGetAllEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllEmployees",
      requestType = com.anju.demo.stub.Employee.AllEmployeeRequest.class,
      responseType = com.anju.demo.stub.Employee.AllEmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anju.demo.stub.Employee.AllEmployeeRequest,
      com.anju.demo.stub.Employee.AllEmployeeResponse> getGetAllEmployeesMethod() {
    io.grpc.MethodDescriptor<com.anju.demo.stub.Employee.AllEmployeeRequest, com.anju.demo.stub.Employee.AllEmployeeResponse> getGetAllEmployeesMethod;
    if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
          EmployeeServiceGrpc.getGetAllEmployeesMethod = getGetAllEmployeesMethod = 
              io.grpc.MethodDescriptor.<com.anju.demo.stub.Employee.AllEmployeeRequest, com.anju.demo.stub.Employee.AllEmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "getAllEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anju.demo.stub.Employee.AllEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anju.demo.stub.Employee.AllEmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("getAllEmployees"))
                  .build();
          }
        }
     }
     return getGetAllEmployeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.anju.demo.stub.Employee.EmployeeRequest,
      com.anju.demo.stub.Employee.IsAnEmployeeResponse> getIsAnEmployeeAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isAnEmployeeAsync",
      requestType = com.anju.demo.stub.Employee.EmployeeRequest.class,
      responseType = com.anju.demo.stub.Employee.IsAnEmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.anju.demo.stub.Employee.EmployeeRequest,
      com.anju.demo.stub.Employee.IsAnEmployeeResponse> getIsAnEmployeeAsyncMethod() {
    io.grpc.MethodDescriptor<com.anju.demo.stub.Employee.EmployeeRequest, com.anju.demo.stub.Employee.IsAnEmployeeResponse> getIsAnEmployeeAsyncMethod;
    if ((getIsAnEmployeeAsyncMethod = EmployeeServiceGrpc.getIsAnEmployeeAsyncMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getIsAnEmployeeAsyncMethod = EmployeeServiceGrpc.getIsAnEmployeeAsyncMethod) == null) {
          EmployeeServiceGrpc.getIsAnEmployeeAsyncMethod = getIsAnEmployeeAsyncMethod = 
              io.grpc.MethodDescriptor.<com.anju.demo.stub.Employee.EmployeeRequest, com.anju.demo.stub.Employee.IsAnEmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "EmployeeService", "isAnEmployeeAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anju.demo.stub.Employee.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.anju.demo.stub.Employee.IsAnEmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("isAnEmployeeAsync"))
                  .build();
          }
        }
     }
     return getIsAnEmployeeAsyncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnEmployee(com.anju.demo.stub.Employee.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.anju.demo.stub.Employee.EmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnEmployeeMethod(), responseObserver);
    }

    /**
     */
    public void getAllEmployees(com.anju.demo.stub.Employee.AllEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.anju.demo.stub.Employee.AllEmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllEmployeesMethod(), responseObserver);
    }

    /**
     */
    public void isAnEmployeeAsync(com.anju.demo.stub.Employee.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.anju.demo.stub.Employee.IsAnEmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsAnEmployeeAsyncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.anju.demo.stub.Employee.EmployeeRequest,
                com.anju.demo.stub.Employee.EmployeeResponse>(
                  this, METHODID_GET_AN_EMPLOYEE)))
          .addMethod(
            getGetAllEmployeesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.anju.demo.stub.Employee.AllEmployeeRequest,
                com.anju.demo.stub.Employee.AllEmployeeResponse>(
                  this, METHODID_GET_ALL_EMPLOYEES)))
          .addMethod(
            getIsAnEmployeeAsyncMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.anju.demo.stub.Employee.EmployeeRequest,
                com.anju.demo.stub.Employee.IsAnEmployeeResponse>(
                  this, METHODID_IS_AN_EMPLOYEE_ASYNC)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
    private EmployeeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAnEmployee(com.anju.demo.stub.Employee.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.anju.demo.stub.Employee.EmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllEmployees(com.anju.demo.stub.Employee.AllEmployeeRequest request,
        io.grpc.stub.StreamObserver<com.anju.demo.stub.Employee.AllEmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isAnEmployeeAsync(com.anju.demo.stub.Employee.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.anju.demo.stub.Employee.IsAnEmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsAnEmployeeAsyncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.anju.demo.stub.Employee.EmployeeResponse getAnEmployee(com.anju.demo.stub.Employee.EmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.anju.demo.stub.Employee.AllEmployeeResponse getAllEmployees(com.anju.demo.stub.Employee.AllEmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllEmployeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.anju.demo.stub.Employee.IsAnEmployeeResponse isAnEmployeeAsync(com.anju.demo.stub.Employee.EmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsAnEmployeeAsyncMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anju.demo.stub.Employee.EmployeeResponse> getAnEmployee(
        com.anju.demo.stub.Employee.EmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anju.demo.stub.Employee.AllEmployeeResponse> getAllEmployees(
        com.anju.demo.stub.Employee.AllEmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.anju.demo.stub.Employee.IsAnEmployeeResponse> isAnEmployeeAsync(
        com.anju.demo.stub.Employee.EmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsAnEmployeeAsyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AN_EMPLOYEE = 0;
  private static final int METHODID_GET_ALL_EMPLOYEES = 1;
  private static final int METHODID_IS_AN_EMPLOYEE_ASYNC = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AN_EMPLOYEE:
          serviceImpl.getAnEmployee((com.anju.demo.stub.Employee.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.anju.demo.stub.Employee.EmployeeResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_EMPLOYEES:
          serviceImpl.getAllEmployees((com.anju.demo.stub.Employee.AllEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.anju.demo.stub.Employee.AllEmployeeResponse>) responseObserver);
          break;
        case METHODID_IS_AN_EMPLOYEE_ASYNC:
          serviceImpl.isAnEmployeeAsync((com.anju.demo.stub.Employee.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.anju.demo.stub.Employee.IsAnEmployeeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.anju.demo.stub.Employee.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetAnEmployeeMethod())
              .addMethod(getGetAllEmployeesMethod())
              .addMethod(getIsAnEmployeeAsyncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
