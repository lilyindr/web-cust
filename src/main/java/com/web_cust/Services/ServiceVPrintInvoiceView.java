package com.web_cust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web_cust.Models.VPrintInvoiceView;
import com.web_cust.Repository.IVPrintInvoiceViewRepository;

@Service
public class ServiceVPrintInvoiceView {
	
	@Autowired
	IVPrintInvoiceViewRepository repoVpiv;
	
	public List<VPrintInvoiceView> getVpivListAll(){
		return repoVpiv.findAll();
	}

}
