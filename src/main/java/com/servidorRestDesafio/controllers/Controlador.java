package com.servidorRestDesafio.controllers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

	@RestController
	public class Controlador{
		
	Logger logger = LoggerFactory.getLogger(Controlador.class);
		
	String status;
	String status1 = "Open";
	String status2 = "Half-Open";
	String status3 = "Close";
	
	@GetMapping("/Open")
	public ResponseEntity<String> setToOpen(){
		status = status1;
		logger.info("El estado actual del cliente es: "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/Half-open")
	public ResponseEntity<String> setToHalfOpen(){
		status = status2;
		logger.info("El estado actual del cliente es: "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/Close")
	public ResponseEntity<String> setToClose(){
		status = status3;
		logger.info("El estado actual del cliente es: "+status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
}
