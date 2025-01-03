package com.web_cust.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransResultBlastDtl;
import com.web_cust.Models.CoreTransResultBlastDtlCompKey;

@Repository
public interface ICoreTransResultBlastDtlRepository extends JpaRepository<CoreTransResultBlastDtl,CoreTransResultBlastDtlCompKey>{
	
	public List<CoreTransResultBlastDtl> findByctrbdCtrbhId(String CtrbhId);

}
