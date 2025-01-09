package com.web_cust.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransRequestEcHdr;

@Repository
public interface ICoreTransRequestEcHdrRepository extends JpaRepository<CoreTransRequestEcHdr,String>{
	
	public List<CoreTransRequestEcHdr> findByCtechStatus(String CtechSts);

}
