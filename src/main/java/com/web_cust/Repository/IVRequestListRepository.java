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

import com.web_cust.Models.VRequestList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;

import jakarta.persistence.StoredProcedureQuery;

@Repository


public interface IVRequestListRepository extends JpaRepository<VRequestList, String>{
		List<VRequestList> findByVrlReqno (String reqno);
		
		List<VRequestList> findByVrlCustnoOrderByVrlDateSort(String usr);
		
		List<VRequestList> findByVrlCustnoAndVrlStatusOrderByVrlDateSort(String usr, String stat);
}
