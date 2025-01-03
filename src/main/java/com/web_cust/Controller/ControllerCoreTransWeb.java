package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransWeb;
import com.web_cust.Services.ServiceCoreTransWeb;

@RestController
public class ControllerCoreTransWeb {
	
	@Autowired
	ServiceCoreTransWeb servCtw;
	
	@GetMapping("/webcust/getWebListAll")
	public List<CoreTransWeb> getWebListAll(){
		return servCtw.getCtwebListAll();
	}

}
