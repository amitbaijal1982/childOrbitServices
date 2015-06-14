package com.childOrbit.bean;


import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	private int studentId;
	private String cardNo;
	
	@NotEmpty(message="Name is Mandatory")
	@Pattern(regexp="[A-z ]*",message="only digits allowed")
    @Length(max = 100,message="Name should not be more than 100 characters")
	private String name;
	
	@NotEmpty(message="admission no is Mandatory")
	private String admissionNo;
	
	@NotEmpty(message="Class is Mandatory")
	private String clas;
	
	@NotEmpty(message="Section is Mandatory")
	private String section;
	
	@Pattern(regexp="[0-9]*",message="Only Numeric values allowed")
	@NotEmpty(message="Roll No is Mandatory")
	private String classRollNo;
	
	private String address;
	private String city;
	private String state;
	
	@Pattern(regexp="[0-9]*",message="Only Numeric values allowed")
	private String busRouteId;
	@Pattern(regexp="[0-9]*",message="Only Numeric values allowed")
	private String busStopId;
	
	@NotEmpty(message="Gender is Mandatory")
	private String gender;

	private String dateOfBirth;
	private String fathername;
	@Length(max = 10,message="Mobile should not be greater than 10 digits")
	private String fmobile;
	private String mothername;
	@Length(max = 10,message="Mobile should not be greater than 10 digits")
	private String mmobile;
	//private String relation;
	//private String password;
	//private String token;
 	//private String deviceId;
	
	public Student(){
		
	}
	


	public Student( 
			String cardNo,
			String name,
			String admissionNo, 
			String clas, 
			String section,
			String classRollNo,
			String address,
			String city,
			String state,
			String busRouteId,
			String busStopId,
			String gender,
			String dateOfBirth,
			//int parentID,
			String fathername,
			String fmobile,
			String mothername,
			String mmobile
		//	String relation,
			//String password,
			//String photo, 
			//	int academicYear
		//	String token, 
		//	String deviceId
			) {
		super();
		this.studentId = studentId;
		this.cardNo = cardNo;
		this.name = name;
		this.admissionNo = admissionNo;
		this.clas = clas;
		this.section = section;
		this.classRollNo = classRollNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.busRouteId = busRouteId;
		this.busStopId = busStopId;
		this.gender = gender;
		/*this.photo = photo;*/
		//	this.academicYear = academicYear;
		//this.parentID = parentID;
		this.dateOfBirth = dateOfBirth;
		this.fathername = fathername;
		this.mothername = mothername;
		this.fmobile = fmobile;
		this.mmobile = mmobile;
		//this.relation = relation;
		/*this.password = password;
		this.token = token;
		this.deviceId = deviceId;*/
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getClassRollNo() {
		return classRollNo;
	}

	public void setClassRollNo(String classRollNo) {
		this.classRollNo = classRollNo;
	}

	public String getBusRouteId() {
		return busRouteId;
	}

	public void setBusRouteId(String busRouteId) {
		this.busRouteId = busRouteId;
	}

	public String getBusStopId() {
		return busStopId;
	}

	public void setBusStopId(String busStopId) {
		this.busStopId = busStopId;
	}

	/*public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	*/
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

/*	public int getParentID() {
		return parentID;
	}



	public void setParentID(int parentID) {
		this.parentID = parentID;
	}
*/





/*	public String getRelation() {
		return relation;
	}



	public void setRelation(String relation) {
		this.relation = relation;
	}
*/


	public String getFathername() {
		return fathername;
	}



	public void setFathername(String fathername) {
		this.fathername = fathername;
	}



	public String getMothername() {
		return mothername;
	}



	public void setMothername(String mothername) {
		this.mothername = mothername;
	}



	public String getFmobile() {
		return fmobile;
	}



	public void setFmobile(String fmobile) {
		this.fmobile = fmobile;
	}



	public String getMmobile() {
		return mmobile;
	}



	public void setMmobile(String mmobile) {
		this.mmobile = mmobile;
	}



	/*public String getPassword() {
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
	}*/

	/*public int getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}*/
	
	
	
}
