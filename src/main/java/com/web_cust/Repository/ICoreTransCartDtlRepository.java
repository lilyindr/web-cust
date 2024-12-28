package com.web_cust.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_cust.Models.CoreTransCartDtl;
import com.web_cust.Models.CoreTransCartDtlCompKey;

public interface ICoreTransCartDtlRepository extends JpaRepository<CoreTransCartDtl,CoreTransCartDtlCompKey>{
	
	public List<CoreTransCartDtl> findByctcdCtchId(String CtchId);

}
