package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransReqVerifyHdr;
import com.web_cust.Services.ServiceCoreTransReqVerifyHdr;

@RestController
public class ControllerCoreTransReqVerifyHdr {
	
	@Autowired
	ServiceCoreTransReqVerifyHdr servCtrvh;
	
	@GetMapping("/webcust/getCtrvhListAll")
	public List<CoreTransReqVerifyHdr> getReqVeriHdrListAll(){
		return servCtrvh.getCtrvhListAll();
	}

}
