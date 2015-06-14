package com.childOrbit.bean;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Teacher{
	/**
	 * 
	 */
	private int teacherId;
	@NotEmpty(message="Name is Mandatory")
	@Pattern(regexp="[A-z ]*",message="only digits allowed")
	@Length(max = 100,message="Name should not be more than 100 characters")
	private String name;
	
	// 18 yrs +
	private String dateOfBirth;
	
	private String gender;
	
	private String address;
	private String state;
	private String city;
	//digits
	@Length(max = 10,message="Mobile should not be greater than 10 digits")
	@Pattern(regexp="[0-9]*",message="Only Numeric values allowed")
	private String mobile; 
	@Length(max = 10,message="Mobile should not be greater than 10 digits")
	@Pattern(regexp="[0-9]*",message="Only Numeric values allowed")
	private String alternateMobile;
	@Pattern(regexp="[0-9]*",message="Only Numeric values allowed")
	private String busRouteId;
	@Pattern(regexp="[0-9]*",message="Only Numeric values allowed")
	private String busStopId;
	private String dateOfJoining;
	private String photo;
	
	public Teacher(){
		
	}
	
	
	

	public Teacher(int teacherId, String name, String dateOfBirth,
			String gender, String address, String state, String city,
			String mobile, String alternateMobile, String busRouteId,
			String busStopId, String dateOfJoining, String photo) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.address = address;
		this.state = state;
		this.city = city;
		this.mobile = mobile;
		this.alternateMobile = alternateMobile;
		this.busRouteId = busRouteId;
		this.busStopId = busStopId;
		this.dateOfJoining = dateOfJoining;
		this.photo = photo;
	}




	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAlternateMobile() {
		return alternateMobile;
	}

	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
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

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
	
}
