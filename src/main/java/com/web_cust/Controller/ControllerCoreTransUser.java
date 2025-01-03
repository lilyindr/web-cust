package com.web_cust.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransUser;
import com.web_cust.Services.ServiceCoreTransUser;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerCoreTransUser {
	
	@Autowired
	ServiceCoreTransUser servCtuser;
	
	@GetMapping("/webcust/getCtuserListAll")
	public List<CoreTransUser> getUserListAll(){
		return servCtuser.getTuserListAll();
	}
}
