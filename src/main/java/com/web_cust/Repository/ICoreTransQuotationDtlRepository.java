package com.web_cust.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransQuotationDtl;
import com.web_cust.Models.CoreTransQuotationDtlCompKey;

@Repository
public interface ICoreTransQuotationDtlRepository extends JpaRepository<CoreTransQuotationDtl,CoreTransQuotationDtlCompKey>{

	public List<CoreTransQuotationDtl> findByctqdCtqhId(String CtqhId);
	
}
