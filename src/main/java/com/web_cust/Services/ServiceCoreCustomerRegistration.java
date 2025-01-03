package com.web_cust.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.web_cust.Models.CoreCustomerRegistration;
import com.web_cust.Repository.ICoreCustomerRegistrationRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCoreCustomerRegistration {
	@Autowired
	ICoreCustomerRegistrationRepository repoccReg;
	
	public List<CoreCustomerRegistration> getCcRegList (){
		return repoccReg.findAll();
	}
		
	public String saveUpdateReg( CoreCustomerRegistration reg) {
		repoccReg.save(reg);
		return "Submit Successfully";
	}
	
	public String getOTP () {
		return repoccReg.exeGetOTP();
	}
	
   
	
}
