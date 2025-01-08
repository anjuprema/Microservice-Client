package com.anju.demo.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//model mapper to map grpcresponse entity to model class
@Configuration
public class ModelMapperFromGrpcResponseToModel {
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
