package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransBlastHdr;
import com.web_cust.Services.ServiceCoreTransBlastHdr;

@RestController
public class ControllerCoreTransBlastHdr {
	
	@Autowired
	ServiceCoreTransBlastHdr servCtbh;
	
	@GetMapping("/webcust/getCtbhListAll")
	public List<CoreTransBlastHdr> getBlastHdrListAll(){
		return servCtbh.getCtbhListAll();
	}

}
