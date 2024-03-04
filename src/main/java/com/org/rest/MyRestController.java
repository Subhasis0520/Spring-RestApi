package com.org.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/")
	public String welcome() {
		return "Good Morning...!!";
	}
}
