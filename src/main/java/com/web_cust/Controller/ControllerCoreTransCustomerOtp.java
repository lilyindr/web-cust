package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransCustomerOtp;
import com.web_cust.Services.ServiceCoreTransCustomerOtp;

@RestController
public class ControllerCoreTransCustomerOtp {
	
	@Autowired
	ServiceCoreTransCustomerOtp servCtcotp;
	
	@GetMapping("/webcust/getCtcotpListAll")
	public List<CoreTransCustomerOtp> getOtpListAll(){
		return servCtcotp.getCtcotpListAll();
	}

}
