package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransHeader;
import com.web_cust.Services.ServiceCoreTransHeader;

@RestController
public class ControllerCoreTransHeader {
	
	@Autowired
	ServiceCoreTransHeader servCthdr;
	
	@GetMapping("/webcust/getCthdrListAll")
	public List<CoreTransHeader> getHeaderListAll(){
		return servCthdr.getCthdrListAll();
	}

}
