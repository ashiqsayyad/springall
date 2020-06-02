package com.ashiq.springlearn.springall.hellocontrollers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hellospring")
	public String hellospring() {
		return "welcome to spring world";
	}
	
	
	@GetMapping("/hellospring-bean") 
	public HelloBean hellospringbean() { return
			new HelloBean("welcome to spring world-Bean"); }
	
	@PostMapping("/hellospringpost") 
	public HelloBean hellospringpost(@Valid @RequestBody HelloBean hbean) { return
			new HelloBean("welcome to spring world-Bean"); }
	
	@GetMapping("/hellospring-exception") 
	public HelloBean hellospringexception() { 
		boolean flag = true;
		if(true)
			throw new RuntimeException("Testing Spring exception") ;
		return new HelloBean("welcome to spring world-Bean");
		
	}
	 
}
