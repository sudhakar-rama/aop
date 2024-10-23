package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.nit.service.HelloService;
import com.nit.service.UserService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootAopOct19Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopOct19Application.class, args);
	}
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private HelloService helloService;

	@Override
	public void run(String... args) throws Exception {
		userService.displayDetails(12L,"Murty");
				//userService.execption();
				userService.printDetails(1200.45F);
				helloService.helloDetails();
				helloService.worldDetails();
	}

}
