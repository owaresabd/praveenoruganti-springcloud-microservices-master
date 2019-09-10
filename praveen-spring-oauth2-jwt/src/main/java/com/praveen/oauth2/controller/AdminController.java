package com.praveen.oauth2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, String>getAdminData() {
		Map<String, String> map = new HashMap<>();
		map.put("1", "admin-value1");
		map.put("2", "admin-value2");
		return map;
	}
}