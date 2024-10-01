package com.product.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemorestController {

	@GetMapping
	public String getDemo() {
		return "Hi this is mahesh..123.";
	}
}
