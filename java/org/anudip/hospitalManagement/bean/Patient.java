package org.anudip.hospitalManagement.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Patient {
	@Id
	private Integer patientId;
	private String patientName;
	private String patientAddress;
	private String contactNo;
	private String gender;
	private String wardId;
	private String admissionDate;
	private String releaseDate;
	private String doctorId;
	private Double medicalExp;
	private Integer doctorVisits;
	private Double doctorFees;
	private String caseDescription;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Integer patientId, String patientName, String patientAddress, String contactNo, String gender,
			String wardId, String admissionDate, String releaseDate, String doctorId, Double medicalExp,
			Integer doctorVisits, Double doctorFees, String caseDescription) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.contactNo = contactNo;
		this.gender = gender;
		this.wardId = wardId;
		this.admissionDate = admissionDate;
		this.releaseDate = releaseDate;
		this.doctorId = doctorId;
		this.medicalExp = medicalExp;
		this.doctorVisits = doctorVisits;
		this.doctorFees = doctorFees;
		this.caseDescription = caseDescription;
	}
	
	public Patient(Integer patientId) {
		super();
		this.patientId = patientId;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getWardId() {
		return wardId;
	}
	public void setWardId(String wardId) {
		this.wardId = wardId;
	}
	public String getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public Double getMedicalExp() {
		return medicalExp;
	}
	public void setMedicalExp(Double medicalExp) {
		this.medicalExp = medicalExp;
	}
	public Integer getDoctorVisits() {
		return doctorVisits;
	}
	public void setDoctorVisits(Integer doctorVisits) {
		this.doctorVisits = doctorVisits;
	}
	public Double getDoctorFees() {
		return doctorFees;
	}
	public void setDoctorFees(Double doctorFees) {
		this.doctorFees = doctorFees;
	}
	public String getCaseDescription() {
		return caseDescription;
	}
	public void setCaseDescription(String caseDescription) {
		this.caseDescription = caseDescription;
	}


}
