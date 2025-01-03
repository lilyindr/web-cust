package com.web_cust.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransRequestEcDtl;
import com.web_cust.Models.CoreTransRequestEcDtlCompKey;

@Repository
public interface ICoreTransRequestEcDtlRepository extends JpaRepository<CoreTransRequestEcDtl,CoreTransRequestEcDtlCompKey>{
	
	public List<CoreTransRequestEcDtl> findByctecdCtechId(String CtechId);

}
