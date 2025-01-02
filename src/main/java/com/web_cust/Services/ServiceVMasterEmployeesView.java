package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.VMasterEmployeesView;
import com.web_cust.Repository.IVMasterEmployeesViewRepository;

@Service
public class ServiceVMasterEmployeesView {
	
	@Autowired
	IVMasterEmployeesViewRepository repoVcmev;
	
	public List<VMasterEmployeesView> getVcmevListAll(){
		return repoVcmev.findAll();
	}

}
