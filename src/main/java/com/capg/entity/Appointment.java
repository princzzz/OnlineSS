package com.capg.entity;
import java.time.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long appointmentId;
	private String location;
	private String visitType;
	private LocalDate preferredDate;
	private LocalTime preferredTime;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "service_name", unique = true)
	private SalonService salonService;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(long appointmentId, String location, String visitType, LocalDate preferredDate,
			LocalTime preferredTime, SalonService salonService) {
		super();
		this.appointmentId = appointmentId;
		this.location = location;
		this.visitType = visitType;
		this.preferredDate = preferredDate;
		this.preferredTime = preferredTime;
		this.salonService = salonService;
	}
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
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", location=" + location + ", visitType=" + visitType
				+ ", preferredDate=" + preferredDate + ", preferredTime=" + preferredTime + ", salonService="
				+ salonService + "]";
	}
	
	
	
}
