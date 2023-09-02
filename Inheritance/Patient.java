package Inheritance;

import java.time.OffsetDateTime;

public class Patient extends Person {
	String name;
	String hospital;
	int yearOfJoining;
	String address;
	double fees;
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Patient(String name, String hospital, int yearOfJoining,
			String address) {
		super();
		this.name = name;
		this.hospital = hospital;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
		
	}
	public double calculateMedicalFee(Money m){
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
        int currentYear = offsetDateTime.getYear();
		double medicalFee=(m.basicFee+m.tax)*(currentYear-yearOfJoining);
		return medicalFee;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", hospital=" + hospital
				+ ", yearOfJoining=" + yearOfJoining + ", address=" + address
				 + "]";
	}
	
	
	
	
	

}
