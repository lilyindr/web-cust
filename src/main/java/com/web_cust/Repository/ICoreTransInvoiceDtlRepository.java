package com.web_cust.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_cust.Models.CoreTransInvoiceDtl;
import com.web_cust.Models.CoreTransInvoiceDtlCompKey;

public interface ICoreTransInvoiceDtlRepository extends JpaRepository<CoreTransInvoiceDtl,CoreTransInvoiceDtlCompKey>{
	
	public List<CoreTransInvoiceDtl> findByctidInvoiceNo(String InvoiceNo);

}
