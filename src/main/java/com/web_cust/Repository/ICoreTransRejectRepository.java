package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransReject;
import com.web_cust.Models.CoreTransRejectCompKey;

@Repository
public interface ICoreTransRejectRepository extends JpaRepository<CoreTransReject,CoreTransRejectCompKey>{

}
