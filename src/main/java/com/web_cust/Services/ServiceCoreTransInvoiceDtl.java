package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.CoreTransInvoiceDtl;
import com.web_cust.Repository.ICoreTransInvoiceDtlRepository;

@Service
public class ServiceCoreTransInvoiceDtl {
	
	@Autowired
	ICoreTransInvoiceDtlRepository repoCtid;
	
	public List<CoreTransInvoiceDtl> getCtidListAll(){
		return repoCtid.findAll();
	}
	
	public List<CoreTransInvoiceDtl> getCtidListByInvNo(String InvoiceNo){
		return repoCtid.findByctidInvoiceNo(InvoiceNo);
	}

}
