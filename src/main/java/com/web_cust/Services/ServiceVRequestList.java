package com.web_cust.Services;

import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.web_cust.Models.VRequestList;
import com.web_cust.Repository.IVRequestListRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;




@Service
public class ServiceVRequestList {
	@Autowired
	IVRequestListRepository repoVrl;
	
	public List<VRequestList> getRequestByUser (String usr){
		return repoVrl.findByVrlCustnoOrderByVrlDateSort(usr);
	}
	
	public List<VRequestList> getRequestByUserStatus (String usr, String stat){
		return repoVrl.findByVrlCustnoAndVrlStatusOrderByVrlDateSort(usr, stat);
	}
	
	public List<VRequestList> getRequestByRequst (String req){
		return repoVrl.findByVrlReqno(req);
	}
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public ProcedureResponse ReqToWeb(String p_reqno, String p_user) {
		//String passEnc = passwordEncoder.encode(userPass);
		String pmsg = "";
		//System.out.println("sssssssssss :"+passEnc);
	    StoredProcedureQuery query = entityManager.createStoredProcedureQuery("adminscheme.p_procreq_toweb");
	    query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
	    query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
	    query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
	    query.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
	    query.setParameter(1, p_reqno);
	    query.setParameter(2, p_user);
	    query.execute();
	    String vresult = (String) query.getOutputParameterValue(3);
	    String vmessage = (String) query.getOutputParameterValue(4);
	    System.out.println("result :"+vresult +'/'+"pmessage:"+vmessage);
	    return new ProcedureResponse(vresult, vmessage);
	    

}
	
	
}
