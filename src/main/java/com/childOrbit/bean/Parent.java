package com.childOrbit.bean;

public class Parent {
	private int parentID;
	private int studentId;
	private String name;
	private String mobile;
	private String relation;
	private String password;
	private String token;
 	private String deviceId;
	
 	public Parent(){
 		
 	}
 	
 	
 	public Parent(int parentID, int studentId, String name, String mobile,
			String relation, String password, String token, String deviceId) {
		this.parentID = parentID;
		this.studentId = studentId;
		this.name = name;
		this.mobile = mobile;
		this.relation = relation;
		this.password = password;
		this.token = token;
		this.deviceId = deviceId;
	}


	public int getParentID() {
		return parentID;
	}


	public void setParentID(int parentID) {
		this.parentID = parentID;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getRelation() {
		return relation;
	}


	public void setRelation(String relation) {
		this.relation = relation;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public String getDeviceId() {
		return deviceId;
	}


	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
 	
 	
}
