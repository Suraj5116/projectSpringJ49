package com.vpms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan
public class VehicleParkingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleParkingSystemApplication.class, args);
	}

}
