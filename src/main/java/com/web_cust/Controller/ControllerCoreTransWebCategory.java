package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransWebCategory;
import com.web_cust.Services.ServiceCoreTransWebCategory;

@RestController
public class ControllerCoreTransWebCategory {
	
	@Autowired
	ServiceCoreTransWebCategory servCtwc;
	
	@GetMapping("/webcust/getCtwcListAll")
	public List<CoreTransWebCategory> getCtwcListAll(){
		return servCtwc.getCtwcListAll();
	}

}
