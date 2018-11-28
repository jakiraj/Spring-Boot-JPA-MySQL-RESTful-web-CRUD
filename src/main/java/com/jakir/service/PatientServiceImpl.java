package com.jakir.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jakir.model.Patient;
import com.jakir.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepository;

	@Override
	public void addPatient(Patient patient) {
		patientRepository.save(patient);
		
	}

	@Override
	public void updatePatient(Patient patient) {
		patientRepository.save(patient);
		
	}

	@Override
	public Patient getPatient(int id) {
		
		return patientRepository.findOne(id);
	}

	@Override
	public List<Patient> getAllPatient() {
		List<Patient> patients = new ArrayList<>();
		patientRepository.findAll().forEach(patients::add);
		return patients;
	}

	@Override
	public void deletePatient(int id) {
		patientRepository.delete(id);
		
	}

}
