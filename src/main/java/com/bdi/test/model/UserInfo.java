package com.bdi.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

// Create, Insert, Update, Delete
@Entity(name="user_info") // table name
@Data
public class UserInfo {
	
	public UserInfo() {
		
	}
	
	// Alt + C
	public UserInfo(Integer uI_NUM, String uI_NAME, String uI_ID, String uI_PWD, String cREDAT, String cRETIM,
			String mODDAT, String mODTIM, String aCTIVE) {
		super();
		UI_NUM = uI_NUM;
		UI_NAME = uI_NAME;
		UI_ID = uI_ID;
		UI_PWD = uI_PWD;
		CREDAT = cREDAT;
		CRETIM = cRETIM;
		MODDAT = mODDAT;
		MODTIM = mODTIM;
		ACTIVE = aCTIVE;
	}
	@Id
	@GeneratedValue
	// column 이름을 줘도 됨
	private Integer UI_NUM;
	private String UI_NAME;
	private String UI_ID;
	private String UI_PWD;
	private String CREDAT;
	private String CRETIM;
	private String MODDAT;
	private String MODTIM;
	private String ACTIVE;
}
