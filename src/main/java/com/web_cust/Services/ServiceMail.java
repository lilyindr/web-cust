package com.web_cust.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class ServiceMail {
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
}
