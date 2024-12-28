package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransEkspedisiHdr;
import com.web_cust.Services.ServiceCoreTransEkspedisiHdr;
@RestController
public class ControllerCoreTransEkspedisiHdr {
	
	@Autowired
	ServiceCoreTransEkspedisiHdr servCteksh;
	
	@GetMapping("/webcust/getCtekshListAll")
	public List<CoreTransEkspedisiHdr> getEkspHdrListAll(){
		return servCteksh.getCtekshListAll();
	}

}
