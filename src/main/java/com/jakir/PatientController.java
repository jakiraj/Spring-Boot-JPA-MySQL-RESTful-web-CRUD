package com.jakir;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jakir.model.Patient;
import com.jakir.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping("/patient/add")
	public void addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
	}
	
	@GetMapping(value="/patients" ,produces= {"application/xml"})
	public List<Patient> getAllPatient(){
		return patientService.getAllPatient();
	}
	
	@PutMapping(value="/patient/update")
	public void updatePatient(@RequestBody Patient patient) {
		patientService.updatePatient(patient);
	}
	
	@GetMapping("/patient/{id}")
	public Patient getPatient(@PathVariable("id") int id) {
		return patientService.getPatient(id);
	}
	
	@DeleteMapping(value="/patient/release/{id}")
	public void releasePatient(@PathVariable int id) {
		patientService.deletePatient(id);
	}

}
