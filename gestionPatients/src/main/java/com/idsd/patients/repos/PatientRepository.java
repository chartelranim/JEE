package com.idsd.patients.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idsd.patients.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	  @Query("SELECT p FROM Patient p WHERE p.nom LIKE %:x% ")
	    List<Patient> chercherPatients(@Param("x") String mc);


} 
