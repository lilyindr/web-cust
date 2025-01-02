package com.web_cust.Models;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "core_customer_registration")
public class CoreCustomerRegistration {
	
	@Id
	@Column(name="ccreg_id", length=20, nullable = false)
	private BigDecimal ccregId;

	@Column(name="ccreg_name", length=80, nullable = false)
	private String ccregName;
	
	@Column(name="ccreg_nickname", length=80)
	private String ccregNickName;
	
	@Column(name="ccreg_national_id", length=50, nullable = false)
	private String ccregNationId;	
	
	@Column(name="ccreg_national_img_filename", length=100)
	private String ccregNationImgFileName;
	
	@Column(name="ccreg_national_img_filepath", length=100)
	private String ccregNationImgFilePath;
	
	@Column(name="ccreg_nib_id", length=50, nullable = false)
	private String ccregNibId;	
	
	@Column(name="ccreg_nib_img_filename", length=100)
	private String ccregNibImgFileName;
	
	@Column(name="ccreg_nib_img_filepath", length=100)
	private String ccregNibImgFilePath;
	
	@Column(name="ccreg_address", length=80)
	private String ccregAddress;
	
	@Column(name="ccreg_rt", length=5)
	private String ccregRt;
	
	@Column(name="ccreg_rw", length=5)
	private String ccregRw;
	
	@Column(name="ccreg_cmpsi_prov", length=10)
	private String ccregProvId;
	
	@Column(name="ccreg_cmcit_city", length=10)
	private String ccregCityId;

	@Column(name="ccreg_cmkec_kec", length=10)
	private String ccregKecId;
	
	@Column(name="ccreg_cmkel_kel", length=10)
	private String ccregKelId;
	
	@Column(name="ccreg_area", length=60)
	private String ccregArea;
	
	@Column(name="ccreg_zip", length=6)
	private String ccregZip;	
	
	@Column(name="ccreg_mobile_phone", length=60)
	private String ccregMobilePhone;
	
	@Column(name="ccreg_phone", length=30)
	private String ccregPhone;
	
	@Column(name="ccreg_email", length=80)
	private String ccregEmail;
	
	@Column(name="ccreg_longlat", length=60)
	private String ccregLongLat;
	
	@Column(name="ccreg_sent_cmba_id", length=5)
	private String ccregSentCmbaId;
	
	@Column(name="ccreg_sent_cmba_name", length=60)
	private String ccregSentCmbaName;
	
	@Column(name="ccreg_sent_cmba_account", length=30)
	private String ccregSentCmbaAccount;
	
	@Column(name="ccreg_recv_cmba_id", length=5)
	private String ccregRevcCmbaId;
	
	@Column(name="ccreg_recv_cmba_name", length=60)
	private String ccregRecvCmbaName;
	
	@Column(name="ccreg_recv_cmba_account", length=30)
	private String ccregRevcCmbaAccount;
	
	@Column(name="ccreg_min_approval")
	private Integer ccregMinApproval;
	
	@Column(name="ccreg_pic1_name", length=60)
	private Integer ccregPic1Name;
	
	@Column(name="ccreg_pic1_phone", length=20)
	private Integer ccregPic1Phone;
	
	@Column(name="creg_pic1_email", length=60)
	private Integer ccregPic1Email;

	@Column(name="ccreg_pic1_password", length=15)
	private Integer ccregPic1password;

	@Column(name="ccreg_pic2_name", length=60)
	private Integer ccregPic2Name;
	
	@Column(name="ccreg_pic2_phone", length=20)
	private Integer ccregPic2Phone;
	
	@Column(name="creg_pic2_email", length=60)
	private Integer ccregPic2Email;

	@Column(name="ccreg_pic2_password", length=15)
	private Integer ccregPic2password;
	
	@Column(name="ccreg_pic3_name", length=60)
	private Integer ccregPic3Name;
	
	@Column(name="ccreg_pic3_phone", length=20)
	private Integer ccregPic3Phone;
	
	@Column(name="creg_pic3_email", length=60)
	private Integer ccregPic3Email;

	@Column(name="ccreg_pic3_password", length=15)
	private Integer ccregPic3password;
}
