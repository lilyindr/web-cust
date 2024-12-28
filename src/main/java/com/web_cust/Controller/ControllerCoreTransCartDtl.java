package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransCartDtl;
import com.web_cust.Services.ServiceCoreTransCartDtl;

@RestController
public class ControllerCoreTransCartDtl {
	
	@Autowired
	ServiceCoreTransCartDtl servCtcd;
	
	@GetMapping("/webcust/getCtcdListAll")
	public List<CoreTransCartDtl> getBlastHdrListAll(){
		return servCtcd.getCtcdListAll();
	}
	
	@GetMapping("/webcust/getCtcdListByCtchId")
	public List<CoreTransCartDtl> getCartDtlListByCtchId(String CtchId){
		return servCtcd.getCtcdListByCtchId(CtchId);
	}

}
