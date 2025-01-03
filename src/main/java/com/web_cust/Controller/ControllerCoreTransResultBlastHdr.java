package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransResultBlastHdr;
import com.web_cust.Services.ServiceCoreTransResultBlastHdr;

@RestController
public class ControllerCoreTransResultBlastHdr {
	
	@Autowired
	ServiceCoreTransResultBlastHdr servCtrbh;
	
	@GetMapping("/webcust/getCtrbhListAll")
	public List<CoreTransResultBlastHdr> getCtrbhListAll(){
		return servCtrbh.getCtrbhListAll();
	}

}
