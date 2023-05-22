package com.UST.DocterAppointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DocterAppointmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocterAppointmentApplication.class, args);
	}

}
