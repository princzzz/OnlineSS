package com.capg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.dto.SalonServicedto;
import com.capg.entity.Orders;
import com.capg.entity.SalonService;
import com.capg.exception.OrderServiceNotFoundException;
import com.capg.exception.SalonServiceNotFoundException;
import com.capg.repository.ISalonRepository;

@Service(value = "SalonService")
@Transactional

public class SalonServiceImp implements ISalonService{


	
	@Autowired
	private ISalonRepository salonRepository;
	
    
	public SalonService addService(SalonServicedto salonService) throws SalonServiceNotFoundException{
		SalonService s=new SalonService();
		s.setServiceId(salonService.getServiceId());
		s.setServiceANme(salonService.getServiceANme());
		s.setServicePrice(salonService.getServicePrice());
		s.setServiceDuration(salonService.getServiceDuration());
		s.setDiscount(salonService.getDiscount());
		
		SalonService s2=salonRepository.save(s);
		return s2;
		
	}

	
	@Override
	public SalonService removeService(Long serviceId) throws SalonServiceNotFoundException{
		Optional<SalonService> salon = salonRepository.findById(serviceId);
		salon.orElseThrow(() -> new SalonServiceNotFoundException("Service.Order_NOT_FOUND"));
		salonRepository.deleteById(serviceId);
		return null;
	}
	
	
    public void updateService(Long serviceId, SalonService salonService) throws SalonServiceNotFoundException{
		Optional<SalonService> salon = salonRepository.findById(serviceId);
		SalonService s = salon.orElseThrow(() -> new SalonServiceNotFoundException("Service.Order_NOT_FOUND"));
		 s.setServiceANme(salonService.getServiceANme());
       
	}
	
    
	public SalonService getService(Long serviceId) throws SalonServiceNotFoundException{
		Optional<SalonService> optional = salonRepository.findById(serviceId);
		SalonService s = optional.orElseThrow(() -> new SalonServiceNotFoundException("Service.Order_NOT_FOUND"));
		SalonService s1 = new SalonService();
		s1.setDiscount(s.getDiscount());
		s1.setServiceANme(s.getServiceANme());
		s1.setServiceDuration(s.getServiceDuration());
		s1.setServiceId(s.getServiceId());
		s1.setServicePrice(s.getServicePrice());
		return s1;
		
	}

	public List<SalonService> getAllServices() throws SalonServiceNotFoundException{
		
		Iterable<SalonService> order2 = salonRepository.findAll(); 
		List<SalonService> s3 = new ArrayList<>();
		order2.forEach(order -> {
			SalonService s = new SalonService();
			s.setDiscount(order.getDiscount());
			s.setServiceANme(order.getServiceANme());
			s.setServiceDuration(order.getServiceDuration());
			s.setServiceId(order.getServiceId());
			s.setServicePrice(order.getServicePrice());
			
			s3.add(s);
		});
		if (s3.isEmpty())
			throw new SalonServiceNotFoundException("Service.Order_NOT_FOUND");
		return s3;
	}
	
	public List<SalonService> getServiceByName() throws SalonServiceNotFoundException{
		Iterable<SalonService> order2 = salonRepository.findAll(); 
		List<SalonService> s3 = new ArrayList<>();
		order2.forEach(order -> {
			SalonService s = new SalonService();
			s.setDiscount(order.getDiscount());
			s.setServiceANme(order.getServiceANme());
			s.setServiceDuration(order.getServiceDuration());
			s.setServiceId(order.getServiceId());
			s.setServicePrice(order.getServicePrice());
			
			s3.add(s);
		});
		if (s3.isEmpty())
			throw new SalonServiceNotFoundException("Service.Order_NOT_FOUND");
		return s3;
	}


	public List<SalonService> getServiceByPrice() throws SalonServiceNotFoundException{
		Iterable<SalonService> order2 = salonRepository.findAll(); 
		List<SalonService> s3 = new ArrayList<>();
		order2.forEach(order -> {
			SalonService s = new SalonService();
			s.setDiscount(order.getDiscount());
			s.setServiceANme(order.getServiceANme());
			s.setServiceDuration(order.getServiceDuration());
			s.setServiceId(order.getServiceId());
			s.setServicePrice(order.getServicePrice());
			
			s3.add(s);
		});
		if (s3.isEmpty())
			throw new SalonServiceNotFoundException("Service.Order_NOT_FOUND");
		return s3;
	}

	public List<SalonService> getServicesByDuration() throws SalonServiceNotFoundException{
		Iterable<SalonService> order2 = salonRepository.findAll(); 
		List<SalonService> s3 = new ArrayList<>();
		order2.forEach(order -> {
			SalonService s = new SalonService();
			s.setDiscount(order.getDiscount());
			s.setServiceANme(order.getServiceANme());
			s.setServiceDuration(order.getServiceDuration());
			s.setServiceId(order.getServiceId());
			s.setServicePrice(order.getServicePrice());
			
			s3.add(s);
		});
		if (s3.isEmpty())
			throw new SalonServiceNotFoundException("Service.Order_NOT_FOUND");
		return s3;
	}

}
