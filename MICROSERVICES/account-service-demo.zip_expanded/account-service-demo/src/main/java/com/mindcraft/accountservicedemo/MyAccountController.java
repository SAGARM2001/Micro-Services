package com.mindcraft.accountservicedemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class MyAccountController {

	// Create fake balance from random account
	@GetMapping(path = "/balance", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, Double> fetchBalance() {
		Map<String, Double> map = new HashMap<>();
		map.put("balance", Double.valueOf(Math.random() * 12345));
		return map;
	}
}
