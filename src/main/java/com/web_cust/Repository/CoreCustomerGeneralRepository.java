package com.web_cust.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.web_cust.Models.CoreCustomerGeneral;

@Repository
public interface CoreCustomerGeneralRepository extends JpaRepository<CoreCustomerGeneral, String>{
	//@Query("select s.glCcDesc from GlCcMaster s where s.glCcCode=?1")
	//public String getGlCcMstDesc(String glCcCode);
	@Procedure(procedureName = "p_check_login")
	public String exeCheckLogin(String userid , String userpass,  String macaddress, String pmsg);	

}
