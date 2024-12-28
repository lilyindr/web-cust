package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransInvoiceHdr;
import com.web_cust.Services.ServiceCoreTransInvoiceHdr;

@RestController
public class ControllerCoreTransInvoiceHdr {
	
	@Autowired
	ServiceCoreTransInvoiceHdr servCtih;
	
	@GetMapping("/webcust/getCtihListAll")
	public List<CoreTransInvoiceHdr> getInvHdrListAll(){
		return servCtih.getCtihListAll();
	}

}
