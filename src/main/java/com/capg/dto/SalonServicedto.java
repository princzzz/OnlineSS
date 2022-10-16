package com.capg.dto;

public class SalonServicedto {

	private long serviceId;
	private String serviceANme;
	private String servicePrice;
	private String serviceDuration;
	private int discount;
	public long getServiceId() {
		return serviceId;
	}
	public String getServiceANme() {
		return serviceANme;
	}
	public String getServicePrice() {
		return servicePrice;
	}
	public String getServiceDuration() {
		return serviceDuration;
	}
	public int getDiscount() {
		return discount;
	}
	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}
	public void setServiceANme(String serviceANme) {
		this.serviceANme = serviceANme;
	}
	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}
	public void setServiceDuration(String serviceDuration) {
		this.serviceDuration = serviceDuration;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "SalonServicedto [serviceId=" + serviceId + ", serviceANme=" + serviceANme + ", servicePrice="
				+ servicePrice + ", serviceDuration=" + serviceDuration + ", discount=" + discount + "]";
	}
	
	
}
