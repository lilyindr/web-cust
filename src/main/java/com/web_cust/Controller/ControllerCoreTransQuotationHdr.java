package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransQuotationHdr;
import com.web_cust.Services.ServiceCoreTransQuotationHdr;

@RestController
public class ControllerCoreTransQuotationHdr {
	
	@Autowired
	ServiceCoreTransQuotationHdr servCtqh;
	
	@GetMapping("/webcust/getCtqhListAll")
	public List<CoreTransQuotationHdr> getQuoHdrListAll(){
		return servCtqh.getCtqhListAll();
	}

}
