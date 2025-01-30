package com.web_cust.Controller;

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
import org.springframework.web.multipart.MultipartFile;

import com.web_cust.Models.CoreTransRequestEcDtl;
import com.web_cust.Models.DTORequestDetailEC;
import com.web_cust.Services.ServiceCoreTransRequestEcDtl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@RestController
public class ControllerCoreTransRequestEcDtl {

	@Autowired
	ServiceCoreTransRequestEcDtl servCtecd;
	@Autowired
	private EntityManager entityManager;

	String msg;
	String p_msg;
	String vimg;
	String vimg2;
	String vimg3;
	String vimg4;
	private List<DTORequestDetailEC> listdto;

	@GetMapping("/webcust/getCtecdListAll")
	public List<CoreTransRequestEcDtl> getReqEcDtlListAll() {
		return servCtecd.getCtecdListAll();
	}

	@GetMapping("/webcust/getCtecdListByCtechId")
	public List<CoreTransRequestEcDtl> getCtecdListByCtechId(String CtechId) {
		return servCtecd.getCtecdListByCtechId(CtechId);
	}

	@GetMapping("/webcust/getRequestList")
	public List<DTORequestDetailEC> getRequestList(String CtechId, String userid) throws IOException { // List<DTORequestDetailEC>

		List<CoreTransRequestEcDtl> reqlist = servCtecd.getCtecdListByCtechId(CtechId);
		 List<DTORequestDetailEC> requestList = new ArrayList<>();

		for (int i = 0; i < reqlist.size(); i++) {

			ResponseEntity<List<String>> imgurl = getAllImagesInRequest(userid, CtechId,
					reqlist.get(i).getCtecdId().toString());

		    vimg=null;vimg2=null;vimg3=null;vimg4=null;		    
		    
			List<String> imageUrls = imgurl.getBody();
			
			if (imgurl != null) {
				for (String imageUrl : imageUrls) {
					//System.out.println("11111111111 : "+imageUrl);
					if (vimg == null) {
						vimg = imageUrl;
						
			        
					}else {
						if (vimg2 == null) {
							vimg2 = imageUrl;
						}else {
							if (vimg3 == null) {
								vimg3 = imageUrl;
								
							}else {
								vimg4 = imageUrl;
							}
						}	
					}
				}
			}
		
			 DTORequestDetailEC dto1 = new DTORequestDetailEC(
					 CtechId,
					 reqlist.get(i).getCtecdUpdateDate(),
					 reqlist.get(i).getCtecdProductName(),
					 reqlist.get(i).getCtecdProducttypeName(),
					 reqlist.get(i).getCtecdProducttypePrice(),
					 reqlist.get(i).getCtecdProducttypeDesc(),
					 reqlist.get(i).getCtecdProductTypeAlias(),
					 reqlist.get(i).getCtecdProductTypeSize(),
					 reqlist.get(i).getCtecdProducttypeStockQty(),
					 reqlist.get(i).getCtecdProducttypeMinQty(),
		             vimg,
		             vimg2,
		             vimg3,
		             vimg4,
		            reqlist.get(i).getCtecdId().toString()
		        );
			 
			 requestList.add(dto1);
			 
			 
			
		}
		
		return requestList;
		

	}

	@GetMapping("/webcust/getCtecdListByCtechIdAndCtecdId")
	public List<CoreTransRequestEcDtl> getCtecdListByCtechIdAndCtecdId(String CtechId, String CtecdId) {
		return servCtecd.getCtecdListByCtechIdAndCtecdId(CtechId, CtecdId);
	}

	@PostMapping("/webcust/saveupdreqecdtl")
	public String createReqWeb(@RequestParam String userid, @RequestPart("data") CoreTransRequestEcDtl data,
			@RequestPart(value = "file1", required = false) MultipartFile file1,
			@RequestPart(value = "file2", required = false) MultipartFile file2,
			@RequestPart(value = "file3", required = false) MultipartFile file3,
			@RequestPart(value = "file4", required = false) MultipartFile file4) throws IOException {
		String temp = servCtecd.getNoReuest();

		String temp2 = execRequestPic(userid, temp);
		data.setCtecdCtechId(temp);
		CoreTransRequestEcDtl createdData = servCtecd.create(data, temp, userid, file1, file2, file3, file4);
		return temp;
	}

	@GetMapping("/webcust/getNorequest")
	public String getNoRequest() {
		return servCtecd.getNoReuest();
	}

	@GetMapping("/webcust/excRequestPic")
	public String execRequestPic(@RequestParam String usercode, @RequestParam String reqno) {
		return servCtecd.callStoredProcedure(usercode, reqno);
	}

	@GetMapping("/webcust/DeleteRequestPic")
	public String deleteRequestPic(@RequestParam String ctih, @RequestParam String ctid) {
		return servCtecd.delete(ctih, ctid);
	}

	@PostMapping("/webcust/UpdateRequest")
	public String UpdateRequest(@RequestParam String id, @RequestParam String userid, @RequestParam String NoRequest,
			@RequestPart("data") CoreTransRequestEcDtl data,
			@RequestPart(value = "file1", required = false) MultipartFile file1,
			@RequestPart(value = "file2", required = false) MultipartFile file2,
			@RequestPart(value = "file3", required = false) MultipartFile file3,
			@RequestPart(value = "file4", required = false) MultipartFile file4) throws IOException {
		return servCtecd.update(id, userid, NoRequest, data, file1, file2, file3, file4);
	}

	/*
	 * @GetMapping("/webcust/getCtecdListByStatus") public
	 * ResponseEntity<CoreTransRequestEcDtl> createRequestEc(
	 * 
	 * @ModelAttribute CoreTransRequestEcDtl recec,
	 * 
	 * @RequestParam("files") List<MultipartFile> files) throws IOException {
	 * 
	 * CoreTransRequestEcDtl createdProduct = servCtecd.createRequestEC(recec,
	 * files); return
	 * ResponseEntity.status(HttpStatus.CREATED).body(createdProduct); }
	 * 
	 */

	@GetMapping(value = "/images/{custNo}/REQUEST/{requstno}/{filename:.+}", produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getImage(@PathVariable String custNo, @PathVariable String requstno,
			@PathVariable String filename) throws IOException {
//System.out.println("aaaaaaa");
		Path imagePath = Paths.get("D:\\iasia\\UI\\IMAGES", custNo, "REQUEST", requstno, filename);
		byte[] imageBytes = Files.readAllBytes(imagePath);
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(MediaType.IMAGE_JPEG_VALUE)).body(imageBytes);
	}

	@GetMapping(value = "/images/{custNo}/REQUEST/{requestno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getAllImagesInRequest(@PathVariable String custNo,
			@PathVariable String requestno, @RequestParam String no) throws IOException {
		// 1. Ambil data filename dari database

		String sql = "SELECT ctecd_prod_type_img1_filename, ctecd_prod_type_img1_filepath, "
				+ "ctecd_prod_type_img2_filename, ctecd_prod_type_img2_filepath, "
				+ "ctecd_prod_type_img3_filename, ctecd_prod_type_img3_filepath, "
				+ "ctecd_prod_type_img4_filename, ctecd_prod_type_img4_filepath "
				+ "FROM webscheme.core_trans_request_ec_dtl WHERE ctecd_ctech_id = :requestno and ctecd_id=:no";

		Query query = entityManager.createNativeQuery(sql);
		query.setParameter("requestno", requestno);
		query.setParameter("no", no);
		Object[] result = (Object[]) query.getSingleResult();
		List<String> imageUrls = new ArrayList<>();
		String baseUrl = "http://localhost:8091/wc-svc/images/" + custNo + "/REQUEST/" + requestno + "/";
		for (int i = 0; i < result.length; i += 2) { // Increment i by 2
			String filename = (String) result[i];
			String filepath = (String) result[i + 1];
			if (filename != null && filepath != null) {

				if (!filename.trim().isEmpty() && !filepath.trim().isEmpty()) {
					Path imagePath = Paths.get("D:\\iasia\\UI\\IMAGES", custNo, "REQUEST", requestno);
					if (Files.exists(imagePath)) {
						imageUrls.add(baseUrl + filename);
					}
				}
			}
		}
		if (!imageUrls.isEmpty()) {
			return ResponseEntity.ok(imageUrls);
		} else {
			return ResponseEntity.notFound().build();
		}

	}
}

/*
 * @GetMapping(value = "/images/{custNo}/REQUEST/{requstno}", produces =
 * MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<List<String>>
 * getAllImagesInRequest(@PathVariable String custNo, @PathVariable String
 * requstno) throws IOException { //System.out.println("bbbbbbbb"); Path
 * requestFolderPath = Paths.get("D:\\iasia\\UI\\IMAGES", custNo, "REQUEST",
 * requstno); String baseUrl = "http://localhost:8091/wc-svc/images/" + custNo +
 * "/REQUEST/"+ requstno; // Base URL gambar
 * 
 * if (Files.exists(requestFolderPath)) { List<String> imageUrls =
 * Files.walk(requestFolderPath) .filter(Files::isRegularFile) .map(path ->
 * baseUrl + '/' +path.getFileName().toString()) // Buat URL lengkap
 * .collect(Collectors.toList()); return ResponseEntity.ok(imageUrls); } else {
 * return ResponseEntity.notFound().build(); } }
 */
