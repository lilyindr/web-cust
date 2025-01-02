package com.web_cust.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.VMasterEmployeesView;
import com.web_cust.Services.ServiceVMasterEmployeesView;

@RestController
public class ControllerVMasterEmployeesView {
	
	@Autowired
	ServiceVMasterEmployeesView servVcmev;
	
	@GetMapping("/webcust/getVcmevListAll")
	public List<VMasterEmployeesView> getVcmevListAll(){
		return servVcmev.getVcmevListAll();
	}

}
