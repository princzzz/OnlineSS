package com.capg.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.capg.entity.SalonService;

@Repository
public interface ISalonRepository extends JpaRepository<SalonService, Long>{
	
	

}
