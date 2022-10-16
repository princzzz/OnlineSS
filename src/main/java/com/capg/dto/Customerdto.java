package com.capg.dto;

import java.time.LocalDate;
import java.util.*;
import java.util.Set;

import com.capg.entity.Address;
import com.capg.entity.User1;

public class Customerdto {

	private int userId;
	private String name;
	private String email;
	private String contactNo;
	private LocalDate dob;
	private User1 user1;
	private List<Addressdto> houseno;
	private Addressdto addressdto;
	
	public Addressdto getAddressdto() {
		return addressdto;
	}
	public void setAddressdto(Addressdto addressdto) {
		this.addressdto = addressdto;
	}
	public int getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public User1 getUser1() {
		return user1;
	}
	public List<Addressdto> getHouseno() {
		return houseno;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public void setUser1(User1 user1) {
		this.user1 = user1;
	}
	public void setHouseno(Addressdto houseno) {
		List<Addressdto> list=new ArrayList<>();
		list.add(houseno);
		this.houseno = list;
	}
	@Override
	public String toString() {
		return "Customerdto [userId=" + userId + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", dob=" + dob + ", user1=" + user1 + ", houseno=" + houseno + ", addressdto=" + addressdto + "]";
	}
	
	
	
}
