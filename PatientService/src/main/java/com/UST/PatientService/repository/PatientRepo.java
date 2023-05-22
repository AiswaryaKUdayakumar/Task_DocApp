package com.UST.PatientService.repository;

import com.UST.PatientService.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
