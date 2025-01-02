package com.web_cust.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransReject;
import com.web_cust.Services.ServiceCoreTransReject;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerCoreTransReject {
	
	@Autowired
	ServiceCoreTransReject servCtr;
	
	@GetMapping("/webcust/getCtrListAll")
	public List<CoreTransReject> getRejectListAll(){
		return servCtr.getCtrListAll();
	}

}
