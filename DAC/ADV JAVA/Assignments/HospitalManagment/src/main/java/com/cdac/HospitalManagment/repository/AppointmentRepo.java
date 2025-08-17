package com.cdac.HospitalManagment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.HospitalManagment.entity.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

	List<Appointment> findByDoctorDoctorId(Long doctorId);
}
