package com.capg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SalonService {
	@Id
	private long serviceId;
	private String serviceName;
	private String servicePrice;
	private String serviceDuration;
	private int discount;
	public SalonService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalonService(long serviceId, String serviceName, String servicePrice, String serviceDuration, int discount) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
		this.serviceDuration = serviceDuration;
		this.discount = discount;
	}
	public long getServiceId() {
		return serviceId;
	}
	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(String servicePrice) {
		this.servicePrice = servicePrice;
	}
	public String getServiceDuration() {
		return serviceDuration;
	}
	public void setServiceDuration(String serviceDuration) {
		this.serviceDuration = serviceDuration;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "SalonService [serviceId=" + serviceId + ", serviceANme=" + serviceName + ", servicePrice="
				+ servicePrice + ", serviceDuration=" + serviceDuration + ", discount=" + discount + "]";
	}
}