package com.llc.aws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

	@RequestMapping(value = "stock")
	public String stock() {
		return "stock";
	}
}
