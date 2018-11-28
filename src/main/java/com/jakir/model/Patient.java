package com.jakir.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Patient {
	
	@Id
	@GeneratedValue
	private int patientId;
	private String patientName;
	private int patientAge;
	private String patientAddress;
	private String patientContactNo;
	private String patientEmail;
	
	public Patient() {	}
	public Patient(int patientId, String patientName, int patientAge, String patientAddress, String patientContactNo,
			String patientEmail) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientAddress = patientAddress;
		this.patientContactNo = patientContactNo;
		this.patientEmail = patientEmail;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientContactNo() {
		return patientContactNo;
	}
	public void setPatientContactNo(String patientContactNo) {
		this.patientContactNo = patientContactNo;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	

}
