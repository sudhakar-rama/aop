package com.nit.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class HelloService {
    
	public void helloDetails() {
		log.info("I am in hello details method ....");
		
	}
	
	public void worldDetails() {
		log.info("I am in world details method ....");
	}
	
	public void abc() {
		log.info("I am in hello details method ....");
	}
}
