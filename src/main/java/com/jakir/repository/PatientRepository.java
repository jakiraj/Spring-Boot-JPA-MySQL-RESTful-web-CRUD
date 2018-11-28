package com.jakir.repository;

import org.springframework.data.repository.CrudRepository;

import com.jakir.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>{

}
