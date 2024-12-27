package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransCustomerOtp;
import com.web_cust.Repository.ICoreTransCustomerOtpRepository;

@Service
public class ServiceCoreTransCustomerOtp {
	
	@Autowired
	ICoreTransCustomerOtpRepository repoCtcotp;
	
	public List<CoreTransCustomerOtp> getCtcotpListAll(){
		return repoCtcotp.findAll();
	}

}
