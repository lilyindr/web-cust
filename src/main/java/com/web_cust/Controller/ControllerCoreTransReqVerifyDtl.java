package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransReqVerifyDtl;
import com.web_cust.Services.ServiceCoreTransReqVerifyDtl;

@RestController
public class ControllerCoreTransReqVerifyDtl {
	
	@Autowired
	ServiceCoreTransReqVerifyDtl servCtrvd;
	
	@GetMapping("/webcust/getCtrvdListAll")
	public List<CoreTransReqVerifyDtl> getReqVeriDtlListAll(){
		return servCtrvd.getCtrvdListAll();
	}
	
	@GetMapping("/webcust/getCtrvdListByCtrvhCtechId")
	public List<CoreTransReqVerifyDtl> getReqVeriDtlListByCtrvhCtechId(String CtrvhCtechId){
		return servCtrvd.getCtrvdListByCtrvhCtechId(CtrvhCtechId);
	}

}
