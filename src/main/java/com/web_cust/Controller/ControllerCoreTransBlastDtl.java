package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransBlastDtl;
import com.web_cust.Services.ServiceCoreTransBlastDtl;

@RestController
public class ControllerCoreTransBlastDtl {
	
	@Autowired
	ServiceCoreTransBlastDtl servCtbd;
	
	@GetMapping("/webcust/getCtbdListByCtbhId")
	public List<CoreTransBlastDtl> getBlastDtlListByCtbhId(String CtbhId){
		return servCtbd.getCtbdListByCtbhId(CtbhId);
	}

}
