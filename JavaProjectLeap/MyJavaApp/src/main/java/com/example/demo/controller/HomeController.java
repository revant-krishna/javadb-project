package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
@RestController
public class HomeController {
	@GetMapping("/home")
public String home() {
	return "Welcome to spring boot";
	}
}
