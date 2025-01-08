package com.web_cust.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.VCategoryType;
import com.web_cust.Models.VCategoryTypeCompKey;

@Repository
public interface IVCategoryTypeRepository extends JpaRepository<VCategoryType,VCategoryTypeCompKey> {
	
	public List<VCategoryType> findByVctCtechIdAndVctCtwIdAndVctCtwcCmctId(String CtechId, Integer CtwId, Integer CtwcCmctId);

}
