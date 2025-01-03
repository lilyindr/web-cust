package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransResultPrice;
import com.web_cust.Services.ServiceCoreTransResultPrice;

@RestController
public class ControllerCoreTransResultPrice {
	
	@Autowired
	ServiceCoreTransResultPrice servCtrp;
	
	@GetMapping("/webcust/getCtrpListAll")
	public List<CoreTransResultPrice> getResultPriceListAll(){
		return servCtrp.getCtrpListAll();
	}

}
