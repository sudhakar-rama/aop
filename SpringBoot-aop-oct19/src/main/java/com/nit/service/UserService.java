package com.nit.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
   public void displayDetails(Long i,String name) {
	   log.info("Its Me!!! ....");
   }
   public void printDetails(Float amount) {
		log.info("I am in print details method ....");
	}
	
   public void execption() {
		throw new RuntimeException("Hello, How are you ?");
	}
}
