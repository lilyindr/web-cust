package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransQuotationHdr;

@Repository
public interface ICoreTransQuotationHdrRepository extends JpaRepository<CoreTransQuotationHdr,String>{

}
