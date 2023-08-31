package com.elhassen.service2.service2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serv2")
@CrossOrigin("*")
public class Service2Controller {
	@GetMapping
	public ResponseEntity<?> getData() {
		return ResponseEntity.ok().body("Hi welcome to Eurika with Java 17 and Spring-boot 3 !");
	}
}