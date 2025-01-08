package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransRequestEcDtl;
import com.web_cust.Services.ServiceCoreTransRequestEcDtl;

@RestController
public class ControllerCoreTransRequestEcDtl {
	
	@Autowired
	ServiceCoreTransRequestEcDtl servCtecd;
	
	@GetMapping("/webcust/getCtecdListAll")
	public List<CoreTransRequestEcDtl> getReqEcDtlListAll(){
		return servCtecd.getCtecdListAll();
	}
	
	@GetMapping("/webcust/getCtecdListByCtechId")
	public List<CoreTransRequestEcDtl> getCtecdListByCtechId(String CtechId){
		return servCtecd.getCtecdListByCtechId(CtechId);
	}
	
	@PostMapping("/webcust/saveupdreqecdtl")
	public String saveUpdateReqEcDtl(@RequestBody CoreTransRequestEcDtl ReqEcDtl) {
		return servCtecd.saveUpdateReqEcDtl(ReqEcDtl);	
	}

}
