package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransInvoiceHdr;
import com.web_cust.Repository.ICoreTransInvoiceHdrRepository;

@Service
public class ServiceCoreTransInvoiceHdr {
	
	@Autowired
	ICoreTransInvoiceHdrRepository repoCtih;
	
	public List<CoreTransInvoiceHdr> getCtihListAll(){
		return repoCtih.findAll();
	}

}
