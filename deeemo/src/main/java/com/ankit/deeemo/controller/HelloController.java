package com.ankit.deeemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
	@RequestMapping (path = "/ankit" , method =RequestMethod.GET)
	public String SayHello(){
		return "hiiii";
	}

}
