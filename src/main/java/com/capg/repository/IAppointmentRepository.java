package com.capg.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entity.Appointment;


@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Long>{
	
	List<Appointment> getAllAppointments(long appointmentId);
	
	List<Appointment> getOpenAppointment(LocalDate preferredDate, LocalTime preferredTime, String location);

}
