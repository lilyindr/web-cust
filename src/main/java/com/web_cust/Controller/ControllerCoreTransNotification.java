package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransCustomerOtp;
import com.web_cust.Models.CoreTransNotification;
import com.web_cust.Services.ServiceCoreTransCustomerOtp;
import com.web_cust.Services.ServiceCoreTransNotification;

@RestController
public class ControllerCoreTransNotification {
	
	@Autowired
	ServiceCoreTransNotification servCtnotif;
	
	@GetMapping("/webcust/getCtnotifListAll")
	public List<CoreTransNotification> getNotifListAll(){
		return servCtnotif.getCtnotifListAll();
	}

}
