package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.advice.CustomException;

@Controller
public class MainController {

	@GetMapping("/test1")
	public void test1() {
		throw new IllegalArgumentException("testException");
	}

	@GetMapping("/test2")
	public void test2() throws CustomException {
		throw new CustomException("customException");
	}
}
