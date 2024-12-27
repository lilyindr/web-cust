package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransCommercial;
import com.web_cust.Services.ServiceCoreTransCommercil;

@RestController
public class ControllerCoreTransCommercil {
	
	@Autowired
	ServiceCoreTransCommercil servCtcmc;
	
	@GetMapping("/webcust/getCtcmcListAll")
	public List<CoreTransCommercial> getCommercilListAll(){
		return servCtcmc.getCtcmcListAll();
	}

}
