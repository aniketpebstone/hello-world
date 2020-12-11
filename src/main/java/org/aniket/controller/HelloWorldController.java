package org.aniket.controller;

import org.aniket.service.SentryExceptionService;
import org.aniket.service.SentryExceptionWithCustomCallbackService;
import org.aniket.service.SentryExceptionWithUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloWorldController {

	@Autowired
	SentryExceptionService sentryExceptionService;
	
	@Autowired
	SentryExceptionWithUserDetailsService sentryExceptionWithUserDetailsService;
	
	@Autowired
	SentryExceptionWithCustomCallbackService sentryExceptionWithCustomCallbackService;
	
	
	@GetMapping("/hello")
    public ResponseEntity<?> hello() {
    	log.info("~ In hello ");
    	log.error("Test message");
        return ResponseEntity.ok("Hello World From Spring Boot!");
    }
	
	@GetMapping("/simple-exception")
    public ResponseEntity<?> simpleException() {
    	log.info("~ In simpleException ");
    	sentryExceptionService.execute();
        return ResponseEntity.ok("Hello World From Spring Boot!");
    }
	
	@GetMapping("/exception-with-user")
    public ResponseEntity<?> exceptionWithUser() {
    	log.info("~ In exceptionWithUser ");
    	sentryExceptionWithUserDetailsService.execute();
        return ResponseEntity.ok("Hello World From Spring Boot!");
    }
	
	@GetMapping("/exception-with-callback")
    public ResponseEntity<?> exceptionWithCallback() {
    	log.info("~ In exceptionWithCallback ");
    	sentryExceptionWithCustomCallbackService.execute();
        return ResponseEntity.ok("Hello World From Spring Boot!");
    }
}
