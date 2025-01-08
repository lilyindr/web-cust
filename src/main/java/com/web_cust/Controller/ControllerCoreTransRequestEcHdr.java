package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransRequestEcHdr;
import com.web_cust.Services.ServiceCoreTransRequestEcHdr;

@RestController
public class ControllerCoreTransRequestEcHdr {
	
	@Autowired
	ServiceCoreTransRequestEcHdr servCtech;
	
	@GetMapping("/webcust/getCtechListAll")
	public List<CoreTransRequestEcHdr> getReqEcHdrListAll(){
		return servCtech.getCtechListAll();
	}
	
	@PostMapping("/webcust/saveupdreqechdr")
	public String saveUpdateReqEcHdr(@RequestBody CoreTransRequestEcHdr ReqEcHdr) {
		return servCtech.saveUpdateReqEcHdr(ReqEcHdr);	
	}

}
