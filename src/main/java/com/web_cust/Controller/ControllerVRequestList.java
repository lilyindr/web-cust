package com.web_cust.Controller;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.web_cust.Models.VRequestList;
import com.web_cust.Services.ProcedureResponse;
import com.web_cust.Services.ServiceVRequestList;






@RestController
public class ControllerVRequestList {
	@Autowired
	ServiceVRequestList servVrl;
	
	@GetMapping("/webcust/getVReqByUser")
	public List<VRequestList> getRequestByUser (String usr){
		return servVrl.getRequestByUser(usr);
	}
	
	@GetMapping("/webcust/getVReqByUserStatus")
	public List<VRequestList> getRequestByUser (String usr, String Stat){
		return servVrl.getRequestByUser(usr);
	}
	
	@GetMapping("/webcust/getVReqByRequest")
	public List<VRequestList> getRequestByRequst (String req){
		return servVrl.getRequestByRequst(req);
	}
	
	@GetMapping("/webcust/SendReqToWeb")
	public ProcedureResponse ReqToWeb(String p_reqno, String p_user) throws FileNotFoundException {
		String msg=null;
		 return servVrl.ReqToWeb(p_reqno, p_user);
	}
}
