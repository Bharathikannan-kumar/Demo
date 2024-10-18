package com.Api1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/Api1")
public class ApiController {

	@GetMapping(value = "/get")
	public String getValue() {
		return "Hello Api connected";
	}

	@GetMapping(value = "/getPrice")
	public Integer getPrice() {
		return 5000+500;
	}

	@Autowired
	RestTemplate rt;

}
