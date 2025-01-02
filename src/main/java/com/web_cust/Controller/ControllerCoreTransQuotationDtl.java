package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransQuotationDtl;
import com.web_cust.Services.ServiceCoreTransQuotationDtl;

@RestController
public class ControllerCoreTransQuotationDtl {
	
	@Autowired
	ServiceCoreTransQuotationDtl servCtqd;
	
	@GetMapping("/webcust/getCtqdListAll")
	public List<CoreTransQuotationDtl> getQuoDtlListAll(){
		return servCtqd.getCtqdListAll();
	}
	
	@GetMapping("/webcust/getCtqdListByCtqhId")
	public List<CoreTransQuotationDtl> getQuoDtlListByCtqhId(String CtqhId){
		return servCtqd.getCtqdListByCtqhId(CtqhId);
	}

}
