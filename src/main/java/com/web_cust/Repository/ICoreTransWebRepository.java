package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web_cust.Models.CoreTransWeb;
import com.web_cust.Models.CoreTransWebCompKey;

@Repository
public interface ICoreTransWebRepository extends JpaRepository<CoreTransWeb,CoreTransWebCompKey>{

}
