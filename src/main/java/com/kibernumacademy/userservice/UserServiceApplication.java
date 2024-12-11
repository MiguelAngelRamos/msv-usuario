package com.kibernumacademy.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
// @EnableEurekaClient esto habilitaba la app como un cliente de Eureka Server para registro
@EnableFeignClients // para la comunicación con otros microservicios
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
