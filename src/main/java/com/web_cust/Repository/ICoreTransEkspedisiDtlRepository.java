package com.web_cust.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web_cust.Models.CoreTransEkspedisiDtl;
import com.web_cust.Models.CoreTransEkspedisiDtlCompKey;

public interface ICoreTransEkspedisiDtlRepository extends JpaRepository<CoreTransEkspedisiDtl,CoreTransEkspedisiDtlCompKey>{
	
	public List<CoreTransEkspedisiDtl> findBycteksdCtekshId(String EkspId);

}
