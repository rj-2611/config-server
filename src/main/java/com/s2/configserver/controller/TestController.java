package com.s2.configserver.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestController {
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String helloWorld() throws Exception{
		return "Hello World!!";
	}
}
