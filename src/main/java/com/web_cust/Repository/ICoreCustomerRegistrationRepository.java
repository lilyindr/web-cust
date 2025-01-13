package com.web_cust.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.web_cust.Models.CoreCustomerGeneral;
import com.web_cust.Models.CoreCustomerRegistration;

@Repository
public interface ICoreCustomerRegistrationRepository  extends JpaRepository<CoreCustomerRegistration, Integer>{
	@Procedure(procedureName = "get_otp")
	public String exeGetOTP();
	
	@Query(value = "SELECT nextval('webscheme.seq_regis_id')",nativeQuery = true)
	public int getRegId();
}
