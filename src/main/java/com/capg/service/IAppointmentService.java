package com.capg.service;

import com.capg.dto.Appointmentdto;
import com.capg.entity.Appointment;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentService extends JpaRepository<Appointment, Long>{
	public Appointment addAppointment(Appointmentdto appointment);
	public Appointment removeAppointment(long id);
	public Appointment updateAppointment(long id);
	public Appointment getAppointment(long id);
	public List<Appointment> getAllAppointments(Appointment appointment);
	public List<Appointment> getOpenAppointments(Appointment appointment);
	
}
