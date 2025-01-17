package com.web_cust.Services;

import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

import com.web_cust.Models.CoreTransRequestEcDtl;
import com.web_cust.Repository.ICoreTransRequestEcDtlRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class ServiceCoreTransRequestEcDtl {
	
	@Autowired
	ICoreTransRequestEcDtlRepository repoCtecd;
	String msg;
	 private final Path rootLocation = Paths.get("D:\\iasia\\UI\\IMAGES");
	
	public List<CoreTransRequestEcDtl> getCtecdListAll(){
		return repoCtecd.findAll();
	}
	
	public List<CoreTransRequestEcDtl> getCtecdListByCtechId(String CtechId){
		return repoCtecd.findByCtecdCtechId(CtechId);
	}
	
	public String saveUpdateReqEcDtl(CoreTransRequestEcDtl ReqEcDtl) {
		repoCtecd.save(ReqEcDtl);
		return "Submit Successfully";
	}
	
	public List<CoreTransRequestEcDtl> getCtecdListByCtecdStatus(String CtecdSts){
		return repoCtecd.findByCtecdStatus(CtecdSts);
	}
	
	
	 public CoreTransRequestEcDtl create(CoreTransRequestEcDtl data, 
			 String NoRequest,
			 String userid,
             MultipartFile file1, 
             MultipartFile file2, 
             MultipartFile file3, 
             MultipartFile file4) throws IOException {
		 

		 String filepath = "D:\\iasia\\UI\\IMAGES\\"+userid+"\\"+NoRequest ;
		 
		if (file1 != null && !file1.isEmpty()) {
		String filename = storeFile(file1, filepath, data, userid, NoRequest);
		data.setCtecdProdTypeImg1Filename(filename);
		data.setCtecdProdTypeImg1Filepath(this.rootLocation.resolve(userid).resolve("REQUEST").resolve(NoRequest).resolve(filename).toString());
		}
		
		if (file2 != null && !file2.isEmpty()) {
			String filename = storeFile(file2, filepath, data, userid, NoRequest);
			data.setCtecdProdTypeImg2Filename(filename);
			data.setCtecdProdTypeImg2Filepath(this.rootLocation.resolve(userid).resolve("REQUEST").resolve(NoRequest).resolve(filename).toString());
			}
		
		if (file3 != null && !file3.isEmpty()) {
			String filename = storeFile(file3, filepath, data, userid, NoRequest);
			data.setCtecdProdTypeImg3Filename(filename);
			data.setCtecdProdTypeImg3Filepath(this.rootLocation.resolve(userid).resolve("REQUEST").resolve(NoRequest).resolve(filename).toString());
			}
		
		if (file4 != null && !file4.isEmpty()) {
			String filename = storeFile(file4, filepath, data, userid, NoRequest);
			data.setCtecdProdTypeImg4Filename(filename);
			data.setCtecdProdTypeImg4Filepath(this.rootLocation.resolve(userid).resolve("REQUEST").resolve(NoRequest).resolve(filename).toString());
			}
		// ... (simpan file 2 sampai 4 dengan logika yang sama)
		
		return repoCtecd.save(data);
	 }
	 
	 public String getNoReuest () {
		 
		 return repoCtecd.exeGetReqNo();
	 }
	 
	 
	// public String callStoredProcedure(String usercode, String reqno) {
	//        String pmsg = ""; // Initial value for pmsg
	//        String result = repoCtecd.getrequestecwebpiw(usercode, reqno, pmsg);
	//        return result; 
	//    }
	 
	 @PersistenceContext
	    private EntityManager entityManager;

	    @Transactional
	    public String callStoredProcedure(String usercode, String reqno) {
	        String pmsg = "";
	        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("webscheme.getrequestecwebpiw");
	        query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
	        query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
	        query.setParameter(1, usercode);
	        query.setParameter(2, reqno);
	        query.setParameter(3, pmsg);
	        query.execute();
	        return (String) query.getOutputParameterValue(3);
	    }
	
	 public void createDirectory(String directoryPath) {
	        File directory = new File(directoryPath);
	        if (!directory.exists()) {
	            directory.mkdirs();
	        }
	    }
	 
	   public String update(String id, String userid, String NoRequest, CoreTransRequestEcDtl data, MultipartFile file1, MultipartFile file2, MultipartFile file3, MultipartFile file4) throws IOException {
	       // CoreTransRequestEcDtl existingData = repository.findById(id).orElse(null);
	       
		   String filepath = "D:\\iasia\\UI\\IMAGES\\"+userid+"\\"+NoRequest ; 
		   
	            if (file1 != null && !file1.isEmpty()) {
	        		String filename = storeFile(file1, filepath, data, userid, NoRequest);
	        		data.setCtecdProdTypeImg1Filename(filename);
	        		data.setCtecdProdTypeImg1Filepath(this.rootLocation.resolve(userid).resolve("REQUEST").resolve(NoRequest).resolve(filename).toString());
	        	}
	            
	            if (file2 != null && !file2.isEmpty()) {
	        		String filename = storeFile(file2, filepath, data, userid, NoRequest);
	        		data.setCtecdProdTypeImg1Filename(filename);
	        		data.setCtecdProdTypeImg1Filepath(this.rootLocation.resolve(userid).resolve("REQUEST").resolve(NoRequest).resolve(filename).toString());
	        	}
	            
	            if (file3 != null && !file3.isEmpty()) {
	        		String filename = storeFile(file3, filepath, data, userid, NoRequest);
	        		data.setCtecdProdTypeImg1Filename(filename);
	        		data.setCtecdProdTypeImg1Filepath(this.rootLocation.resolve(userid).resolve("REQUEST").resolve(NoRequest).resolve(filename).toString());
	        	}
	            
	            if (file4 != null && !file4.isEmpty()) {
	        		String filename = storeFile(file4, filepath, data, userid, NoRequest);
	        		data.setCtecdProdTypeImg1Filename(filename);
	        		data.setCtecdProdTypeImg1Filepath(this.rootLocation.resolve(userid).resolve("REQUEST").resolve(NoRequest).resolve(filename).toString());
	        	}

	             repoCtecd.save(data);
	             return "Submit Successfully";
	    }
	   
	   public String delete(String ctih,  String ctid) { 
	    	repoCtecd.deleteRequestDtl(ctih, ctid); 
	        return "Submit Successfully";
	    }	 
	
	 private String storeFile(MultipartFile file, String filepath, CoreTransRequestEcDtl data, String userid, String Noreq) throws IOException {
	     String filename = file.getOriginalFilename();

	     try {
	         // Pastikan filepath adalah path absolut dan valid
	         Path targetLocation = this.rootLocation.resolve(userid).resolve("REQUEST").resolve(Noreq).resolve(filename);

	         // Buat direktori jika belum ada
	         Files.createDirectories(targetLocation.getParent());

	         // Salin file dengan StandardCopyOption.REPLACE_EXISTING
	         Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING); 

	         return filename;
	     } catch (IOException e) {
	         System.err.println("Error: Gagal menyimpan file: " + e.getMessage());
	         throw e; // Atau tangani error dengan cara lain
	     }
	 }

}
