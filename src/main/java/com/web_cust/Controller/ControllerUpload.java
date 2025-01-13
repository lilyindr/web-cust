package com.web_cust.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ControllerUpload {
	
	public void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }
	
	@PostMapping ("file/RegisUpload")
	public ResponseEntity<String> UploadFile(@RequestParam("dirname") String dirname, @RequestParam("file") MultipartFile file){
		
		if (file.isEmpty()) {
			return new ResponseEntity<>("file is Empty :", HttpStatus.BAD_REQUEST);
		}
		
		String filepath = "D:\\iasia\\UI\\IMAGES\\REGISTRATIONS\\" + dirname ;
		//String dirname = "test456";
		File directory = new File(filepath);
		
		try {
			if (!directory.exists()) {
				createDirectory("D:\\iasia\\UI\\IMAGES\\REGISTRATIONS\\"+dirname);
			}
	    } catch (Exception e) {
            // Handle the exception (e.g., log it or throw a custom exception)
        }
		
		
		try {
			
			System.out.println(
					"original filename :"+file.getOriginalFilename()+
					"file sizw :"+file.getSize()+
					"Content Type :"+file.getContentType());		
			
			//String filepath ="D:\\iasia\\UI\\IMAGES\\REGISTRATIONS\\"+dirname+"\\";
			
			File file1 = new File(filepath +File.separator+file.getOriginalFilename());
			
			file.transferTo(file1);
			
		}catch (Exception exception) {
			exception.printStackTrace();
			return new ResponseEntity<>(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		return new ResponseEntity<>("Upload File Successfully", HttpStatus.OK);
	}

}
