package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransResultBlastHdr;

@Repository
public interface ICoreTransResultBlastHdrRepository extends JpaRepository<CoreTransResultBlastHdr,String>{

}
