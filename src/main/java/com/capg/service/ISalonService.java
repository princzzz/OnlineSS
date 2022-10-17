package com.capg.service;

import java.util.List;

import com.capg.dto.SalonServicedto;
import com.capg.entity.SalonService;
import com.capg.exception.SalonServiceNotFoundException;

public interface ISalonService {

	public SalonService addService(SalonServicedto salonService) throws SalonServiceNotFoundException;
	public SalonService removeService(Long serviceId) throws SalonServiceNotFoundException;
     public void updateService(Long serviceId, SalonService salonService) throws SalonServiceNotFoundException;
	public SalonService getService(Long serviceId) throws SalonServiceNotFoundException;
	public List<SalonService> getAllServices() throws SalonServiceNotFoundException;
	public List<SalonService> getServiceByName() throws SalonServiceNotFoundException;
	public List<SalonService> getServiceByPrice() throws SalonServiceNotFoundException;
	public List<SalonService> getServicesByDuration() throws SalonServiceNotFoundException;
}
