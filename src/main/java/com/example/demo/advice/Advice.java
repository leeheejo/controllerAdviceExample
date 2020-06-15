package com.example.demo.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Advice {

	@ExceptionHandler(IllegalArgumentException.class)
	public void exception(IllegalArgumentException ex) {
		System.out.println("Controller Advice: " + ex.getMessage());
	}

	@ExceptionHandler(CustomException.class)
	public void exception(CustomException ex) {
		System.out.println("Controller Advice: " + ex.getMessage());
	}
}
