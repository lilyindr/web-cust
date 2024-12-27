package com.web_cust.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.web_cust.Models.CoreCustomerGeneral;
import com.web_cust.Repository.ICoreCustomerGeneralRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCoreCustomerGeneral {
	@Autowired
	ICoreCustomerGeneralRepository repoCCUST;
	
	public String exeCheckLogin(String userid , String userpass,  String macaddress, String pmsg ) {
		return repoCCUST.exeCheckLogin(userid, userpass, macaddress, pmsg);
	}
	
	public List<CoreCustomerGeneral> getCustomerAllList(){
		return repoCCUST.findAll();
	}
}
