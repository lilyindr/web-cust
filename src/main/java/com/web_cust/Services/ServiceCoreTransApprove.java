package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreCustomerGeneral;
import com.web_cust.Models.CoreTransApprove;
import com.web_cust.Repository.ICoreTransApproveRepository;

@Service
public class ServiceCoreTransApprove {
	
	@Autowired
	ICoreTransApproveRepository repoCta;
	
	public List<CoreTransApprove> getCtaListAll(){
		return repoCta.findAll();
	}

}
