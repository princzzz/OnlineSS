package com.capg.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.dto.Appointmentdto;
import com.capg.dto.Customerdto;
import com.capg.dto.Paymentdto;
import com.capg.dto.SalonServicedto;
import com.capg.entity.Appointment;
import com.capg.entity.Customer;
import com.capg.repository.IAppointmentRepository;

@Service(value="appointmentService")
@Transactional
public class AppointmentServiceImp implements IAppointmentService {
	
	@Autowired
	private IAppointmentRepository appointmentRepository;
	
	@Override
	public Appointment addAppointment(Appointmentdto appointment) {
		Appointment appointmentEntity = new Appointment();
		appointmentEntity.setAppointmentId(appointment.getAppointmentId());
		appointmentEntity.setLocation(appointment.getLocation());
		appointmentEntity.setVisitType(appointment.getVisitType());
		appointmentEntity.setPreferredDate(appointment.getPreferredDate());
		appointmentEntity.setPreferredTime(appointment.getPreferredTime());
		
		//CustomerDTO
		Customerdto customer= new Customerdto();
		customer.setName(appointment.getCustomerdto().getName());
		customer.setEmail(appointment.getCustomerdto().getEmail());
		customer.setContactNo(appointment.getCustomerdto().getContactNo());
		appointment.setCustomerdto(customer);
		
		//PaymentDTO
		Paymentdto payment= new Paymentdto();
		payment.setPaymentId(appointment.getPaymentdto().getPaymentId());
		payment.setStatus(appointment.getPaymentdto().getStatus());
		payment.setType(appointment.getPaymentdto().getType());
		appointment.setPaymentdto(payment);
		
		Appointment appointmentEntity2 = appointmentRepository.save(appointmentEntity);
		return appointmentEntity2;
	}
	
	@Override
	public Appointment removeAppointment(long id) {
		return null;
	}
	
	@Override
	public Appointment updateAppointment(long id) {
		return null;
	}
	
	@Override
	public Appointment getAppointment(long id) {
		return null;
	}
	
	@Override
	public List<Appointment> getAllAppointments(Appointment appointment){
		List<Appointment> obAppointments=new ArrayList<>();
		return obAppointments;
	}
	
	@Override
	public List<Appointment> getOpenAppointments(Appointment appointment){
		List<Appointment> obAppointments=new ArrayList<>();
		return obAppointments;
	}
}