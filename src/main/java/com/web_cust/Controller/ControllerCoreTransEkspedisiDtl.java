package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreTransEkspedisiDtl;
import com.web_cust.Services.ServiceCoreTransEkspedisiDtl;

@RestController
public class ControllerCoreTransEkspedisiDtl {
	
	@Autowired
	ServiceCoreTransEkspedisiDtl servCteksd;
	
	@GetMapping("/webcust/getCteksdListAll")
	public List<CoreTransEkspedisiDtl> getEkspDtlListAll(){
		return servCteksd.getCteksdListAll();
	}
	
	@GetMapping("/webcust/getCteksdListByCteksh")
	public List<CoreTransEkspedisiDtl> getEkspDtlListByCteksh(String EkspId){
		return servCteksd.getCteksdListByCtekshId(EkspId);
	}

}
