package com.accesso.cicdpocdemoartifact.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller public class GreetingController
{

	@GetMapping("/greeting")
	public ResponseEntity<String> greeting(@RequestParam(name = "name", required = false, defaultValue = "World") final String name)
	{
		return new ResponseEntity<>("Hello, " + name + "!", HttpStatus.OK);
	}

}
