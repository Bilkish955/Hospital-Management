package org.anudip.hospitalManagement.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Doctor {
	@Id
	private String doctorId;
	private String doctorName;
	private String specialization;
	private Double fee;
	private Integer patients;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctorId, String doctorName, String specialization, Double fee, Integer patients) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.fee = fee;
		this.patients = patients;
	}
	
	public Doctor(String doctorId) {
		super();
		this.doctorId = doctorId;
	}
	
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public Integer getPatients() {
		return patients;
	}
	public void setPatients(Integer patients) {
		this.patients = patients;
	}


}
