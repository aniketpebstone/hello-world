package org.aniket.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloWorldController {

	@GetMapping()
    public ResponseEntity<?> serviceTest() {
    	log.info("~ In serviceTest ");
        return ResponseEntity.ok("Hello World From Spring Boot!");
    }
}
