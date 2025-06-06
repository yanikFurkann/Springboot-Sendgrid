package com.furkanyanik.controller;



import org.apache.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furkanyanik.dto.EmailRequest;
import com.furkanyanik.service.EmailService;
import com.sendgrid.Response;



@RestController
@RequestMapping("/api/key")
public class EmailController {
@Autowired
	private EmailService emailService;

	
	@PostMapping ("/sendEmail")
	
	public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest){
		
		Response  response =emailService.sendEmail(emailRequest);
		int statusCode = response.getStatusCode();

	    if (statusCode == 200 || statusCode == 202) {
	        return ResponseEntity.ok("send successfully");
	    } else if (statusCode == 404) {
	        return ResponseEntity.status(404).body("failed to send");
	    } else {
	        return ResponseEntity.status(500).body("Email could not be sent");
	    }
		
	}
	
	
	@GetMapping ("/test")
	public String test() {
		return "test	" ;
	}
	
	
	
}
