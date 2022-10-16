package com.capg.repository;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entity.SalonService;

@Repository
public interface ISalonRepository extends JpaRepository<SalonService, Long>{
	
	List<Service> findByServicesId(long serviceId);
	
	List<Service> findByName(String serviceName);
	
	List<Service> findByPrice(String servicePrice);
	
	List<Service> findByDuration(String serviceDuration);
	
	

}
