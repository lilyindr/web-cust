package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransResultRegion;
import com.web_cust.Services.ServiceCoreTransResultRegion;

@RestController
public class ControllerCoreTransResultRegion {
	
	@Autowired
	ServiceCoreTransResultRegion servCtrr;
	
	@GetMapping("/webcust/getCtrrListAll")
	public List<CoreTransResultRegion> getResultRegionListAll(){
		return servCtrr.getCtrrListAll();
	}

}
