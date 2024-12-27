package com.web_cust.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.web_cust.Models.CoreTransApprove;
import com.web_cust.Models.CoreTransApproveCompKey;

public interface ICoreTransApproveRepository extends JpaRepository<CoreTransApprove,CoreTransApproveCompKey> {

}
