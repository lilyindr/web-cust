package com.web_cust.Controller;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.web_cust.Models.CoreTransRequestEcDtl;
import com.web_cust.Services.ServiceCoreTransRequestEcDtl;

@RestController
public class ControllerCoreTransRequestEcDtl {
	
	@Autowired
	ServiceCoreTransRequestEcDtl servCtecd;
	
	String msg;
	String p_msg;
	
	@GetMapping("/webcust/getCtecdListAll")
	public List<CoreTransRequestEcDtl> getReqEcDtlListAll(){
		return servCtecd.getCtecdListAll();
	}
	
	@GetMapping("/webcust/getCtecdListByCtechId")
	public List<CoreTransRequestEcDtl> getCtecdListByCtechId(String CtechId){
		return servCtecd.getCtecdListByCtechId(CtechId);
	}
	
	@PostMapping("/webcust/saveupdreqecdtl")	
	 public String createReqWeb(@RequestParam String userid,
	            @RequestPart("data") CoreTransRequestEcDtl data,
	            @RequestPart(value = "file1", required = false) MultipartFile file1,
	            @RequestPart(value = "file2", required = false) MultipartFile file2,
	            @RequestPart(value = "file3", required = false) MultipartFile file3,
	            @RequestPart(value = "file4", required = false) MultipartFile file4
	    ) throws IOException {
		 	String temp = servCtecd.getNoReuest();
		 	System.out.println(" no request :"+temp);
	        CoreTransRequestEcDtl createdData = servCtecd.create(data, temp, userid, file1, file2, file3, file4);
	       return temp;
	    }
	
	@GetMapping("/webcust/getNorequest")
	public String getNoRequest () {
		
	
		
		 return servCtecd.getNoReuest();
	
	}
	
	
	
	
	/*	@GetMapping("/webcust/getCtecdListByStatus")	
    public ResponseEntity<CoreTransRequestEcDtl> createRequestEc(
            @ModelAttribute CoreTransRequestEcDtl recec,
            @RequestParam("files") List<MultipartFile> files) throws IOException { 

		CoreTransRequestEcDtl createdProduct = servCtecd.createRequestEC(recec, files);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }
	
	
	
	@GetMapping(value = "/images/{custNo}/REQUEST/{filename:.+}", produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getImage(
	        @PathVariable String custNo, 
	        @PathVariable String filename) throws IOException {

		 Path imagePath = Paths.get("D:\\iasia\\UI\\IMAGES", custNo, "REQUEST", filename); 
	    byte[] imageBytes = Files.readAllBytes(imagePath);
	    return ResponseEntity.ok()
	            .contentType(MediaType.parseMediaType(MediaType.IMAGE_JPEG_VALUE))
	            .body(imageBytes); 
	}
	
	@GetMapping(value = "/images/{custNo}/REQUEST", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getAllImagesInRequest(@PathVariable String custNo) throws IOException {

	    Path requestFolderPath = Paths.get("D:\\iasia\\UI\\IMAGES", custNo, "REQUEST");
	    String baseUrl = "http://localhost:8091/wc-svc/images/" + custNo + "/REQUEST/"; // Base URL gambar

	    if (Files.exists(requestFolderPath)) {
	        List<String> imageUrls = Files.walk(requestFolderPath)
	                .filter(Files::isRegularFile)
	                .map(path -> baseUrl + path.getFileName().toString()) // Buat URL lengkap
	                .collect(Collectors.toList());

	        return ResponseEntity.ok(imageUrls);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	 @PostMapping(value="/webcust/saveupdreqecdtl",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	    public ResponseEntity<CoreTransRequestEcDtl> createProduct(
	            @ModelAttribute CoreTransRequestEcDtl reqec,
	            @RequestParam("files") List<MultipartFile> files) throws IOException { 
         System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		 CoreTransRequestEcDtl createdProduct = servCtecd.createRequestEC(reqec, files);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
	    }
	*/

	
}
