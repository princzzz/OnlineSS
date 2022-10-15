package com.capg.entity;
import java.time.LocalDate;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	private String name;
	private String email;
	private String contactNo;
	private LocalDate dob;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private List<Address> houseno; 
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer userId, String name, String email, String contactNo, LocalDate dob, List<Address> houseno) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.dob = dob;
		this.houseno = houseno;
	}
	public Integer getUserId() {
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
	public List<Address> getHouseno() {
		return houseno;
	}
	public void setUserId(Integer userId) {
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
	public void setHouseno(List<Address> houseno) {
		this.houseno = houseno;
	}
	@Override
	public String toString() {
		return "Customer [userId=" + userId + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", dob=" + dob + ", houseno=" + houseno + "]";
	}
	
	
	
	
	
	
}
