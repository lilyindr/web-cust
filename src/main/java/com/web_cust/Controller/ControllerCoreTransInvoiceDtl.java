package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransInvoiceDtl;
import com.web_cust.Services.ServiceCoreTransInvoiceDtl;

@RestController
public class ControllerCoreTransInvoiceDtl {
	
	@Autowired
	ServiceCoreTransInvoiceDtl servCtid;
	
	@GetMapping("/webcust/getCtidListAll")
	public List<CoreTransInvoiceDtl> getInvDtlListAll(){
		return servCtid.getCtidListAll();
	}
	
	@GetMapping("/webcust/getCtidListByInvNo")
	public List<CoreTransInvoiceDtl> getInvDtlListByInvNo(String InvoiceNo){
		return servCtid.getCtidListByInvNo(InvoiceNo);
	}

}
