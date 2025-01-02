package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.VCoreBlastHdrView;
import com.web_cust.Services.ServiceVCoreBlastHdrView;

@RestController
public class ControllerVCoreBlastHdrView {
	
	@Autowired
	ServiceVCoreBlastHdrView servVcbhv;
	
	@GetMapping("/webcust/getVcbhvListAll")
	public List<VCoreBlastHdrView> getVcbhvListAll(){
		return servVcbhv.getVcbhvListAll();
	}

}
