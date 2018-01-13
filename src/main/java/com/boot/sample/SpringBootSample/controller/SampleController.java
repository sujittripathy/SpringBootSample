package com.boot.sample.SpringBootSample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/api/sample")
	public String sampleAPI(){
		return "Sample Response 1";
	}
}
