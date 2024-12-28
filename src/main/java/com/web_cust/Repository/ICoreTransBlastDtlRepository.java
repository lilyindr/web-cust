package com.web_cust.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_cust.Models.CoreTransBlastDtl;
import com.web_cust.Models.CoreTransBlastDtlCompKey;

public interface ICoreTransBlastDtlRepository extends JpaRepository<CoreTransBlastDtl,CoreTransBlastDtlCompKey>{
	
	public List<CoreTransBlastDtl> findByctbdCtbhId(String CtbhId);

}
