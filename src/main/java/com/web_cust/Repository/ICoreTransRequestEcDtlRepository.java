package com.web_cust.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.web_cust.Models.CoreTransRequestEcDtl;
import com.web_cust.Models.CoreTransRequestEcDtlCompKey;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;

import jakarta.persistence.StoredProcedureQuery;

@Repository

public interface ICoreTransRequestEcDtlRepository extends JpaRepository<CoreTransRequestEcDtl,CoreTransRequestEcDtlCompKey>{

	 
	public List<CoreTransRequestEcDtl> findByctecdCtechId(String CtechId);
	
	public List<CoreTransRequestEcDtl> findByCtecdStatus(String CtecdSts);
	
	@Procedure(procedureName = "getRequestECWebNo")
	public String exeGetReqNo();
	
	//@Transactional
   // @Modifying
   // @Procedure(procedureName = "webscheme.getrequestecwebpiw") // No outputParameterName
    //String getrequestecwebpiw(String usercode, String reqno, String pmsg);
	
}
