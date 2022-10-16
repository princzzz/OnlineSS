package com.capg.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.capg.entity.Customer;
import com.capg.entity.Payment;
import com.capg.entity.SalonService;

public class Appointmentdto {

	private long appointmentId;
	private String location;
	private String visitType;
	private LocalDate preferredDate;
	private LocalTime preferredTime;
	private SalonService salonService;
	private Customerdto customer;
	private Paymentdto payment;
	public long getAppointmentId() {
		return appointmentId;
	}
	public String getLocation() {
		return location;
	}
	public String getVisitType() {
		return visitType;
	}
	public LocalDate getPreferredDate() {
		return preferredDate;
	}
	public LocalTime getPreferredTime() {
		return preferredTime;
	}
	public SalonService getSalonService() {
		return salonService;
	}
	public Customerdto getCustomerdto() {
		return customer;
	}
	public Paymentdto getPaymentdto() {
		return payment;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}
	public void setPreferredDate(LocalDate preferredDate) {
		this.preferredDate = preferredDate;
	}
	public void setPreferredTime(LocalTime preferredTime) {
		this.preferredTime = preferredTime;
	}
	public void setSalonService(SalonService salonService) {
		this.salonService = salonService;
	}
	public void setCustomerdto(Customerdto customer) {
		this.customer = customer;
	}
	public void setPaymentdto(Paymentdto payment) {
		this.payment = payment;
	}
	@Override
	public String toString() {
		return "Appointmentdto [appointmentId=" + appointmentId + ", location=" + location + ", visitType=" + visitType
				+ ", preferredDate=" + preferredDate + ", preferredTime=" + preferredTime + ", salonService="
				+ salonService + ", customer=" + customer + ", payment=" + payment + "]";
	}
	
	
}
