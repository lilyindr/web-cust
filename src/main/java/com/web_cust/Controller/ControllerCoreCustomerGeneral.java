package com.web_cust.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreCustomerGeneral;
import com.web_cust.Repository.ICoreCustomerGeneralRepository;
import com.web_cust.Services.ServiceCoreCustomerGeneral;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerCoreCustomerGeneral {
	@Autowired
	ServiceCoreCustomerGeneral servCCUST;
	
	@GetMapping("/webcust/exeLogin")
	public String exeCheckLogin (String userid , String userpass,  String macaddress, String pmsg) {
		System.out.println("bbbbb :"+userid);     
		return servCCUST.exeCheckLogin(userid, userpass, macaddress, pmsg);
	}
	
	@GetMapping("/webcust/getCustAllList")
	public List<CoreCustomerGeneral> getCustomerAllList(){
		return servCCUST.getCustomerAllList();
	}
	
	
}
