package com.web_cust.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransReqVerifyDtl;
import com.web_cust.Models.CoreTransReqVerifyDtlCompKey;

@Repository
public interface ICoreTransReqVerifyDtlRepository extends JpaRepository<CoreTransReqVerifyDtl,CoreTransReqVerifyDtlCompKey>{
	
	public List<CoreTransReqVerifyDtl> findByctrvdCtrvhCtechId(String CtrvhCtechId);

}
