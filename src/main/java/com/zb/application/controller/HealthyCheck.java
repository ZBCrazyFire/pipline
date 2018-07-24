package com.zb.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthyCheck {
	@RequestMapping("api/healthy/check")
	public String HealthyCheckMethod() {
		return "true";
	}
}
