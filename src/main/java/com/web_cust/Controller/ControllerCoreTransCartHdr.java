package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransCartHdr;
import com.web_cust.Services.ServiceCoreTransCartHdr;

@RestController
public class ControllerCoreTransCartHdr {
	
	@Autowired
	ServiceCoreTransCartHdr servCtch;
	
	@GetMapping("/webcust/getCtchListAll")
	public List<CoreTransCartHdr> getCartHdrListAll(){
		return servCtch.getCtchListAll();
	}

}
