package com.web_cust.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreCustomerGeneral;
import com.web_cust.Models.CoreCustomerRegistration;
import com.web_cust.Repository.ICoreCustomerGeneralRepository;
import com.web_cust.Services.ServiceCoreCustomerGeneral;
import com.web_cust.Services.ServiceCoreCustomerRegistration;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerCoreCustomerRegistration {
	@Autowired
	ServiceCoreCustomerRegistration servccReg;
	
	@GetMapping("/webcust/getCustRegList")
	public List<CoreCustomerRegistration> getCcRegList (){
		return servccReg.getCcRegList();
	}
	
	@PostMapping("/reg/saveupdreg")
	public String saveUpdateMstJurnal(@RequestBody CoreCustomerRegistration reg) {
		return servccReg.saveUpdateReg(reg);
	
	}
}
