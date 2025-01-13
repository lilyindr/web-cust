package com.web_cust.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web_cust.Models.CoreCustomerRegistration;
import com.web_cust.Models.EmailRequest;
import com.web_cust.Repository.ICoreCustomerGeneralRepository;
import com.web_cust.Services.ServiceCoreCustomerGeneral;
import com.web_cust.Services.ServiceCoreCustomerRegistration;
import com.web_cust.Services.ServiceMail;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerCoreCustomerRegistration {
	@Autowired
	ServiceCoreCustomerRegistration servccReg;
	@Autowired
	private JavaMailSender emailSender;

    public void sendEmail(String to, String subject, String text) {
    	  SimpleMailMessage message = new SimpleMailMessage(); 
          message.setFrom("tulalit053@gmail.com");
          message.setTo(to); 
          message.setSubject(subject); 
          message.setText(text);
          emailSender.send(message);
    }
    
	@GetMapping("/webcust/getCustRegList")
	public List<CoreCustomerRegistration> getCcRegList (){
		return servccReg.getCcRegList();
	}
	
	@PostMapping("/reg/saveupdreg")
	public String saveUpdateMstJurnal(@RequestBody CoreCustomerRegistration reg) {
		return servccReg.saveUpdateReg(reg);	
	}
	
	@GetMapping("/reg/send-email")
	public String sendEmail(@RequestParam String to, 
	                             @RequestParam String subject) {
		String otp=servccReg.getOTP();
		System.out.println("aaaaaa :"+otp);
		String text ="your OTP is : "+otp;
		 sendEmail(to, subject, text);
	        return otp;
	    }
	
	@GetMapping("/reg/getregid")
	public int getRegId() {
		return servccReg.getRegId();
	}
	
}
