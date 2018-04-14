package com.udemy.hospital.donewrong;

public class HospitalManagement { // class doing too much.  would need modification to create more jobs.
	
	public void callUpon(Employee emp) {
		if(emp instanceof Nurse) { // instanceof should indicate bad code - make obvious wout checking
			checkVitalSigns();
			drawBlood();
			cleanPatientArea();
		} else if (emp instanceof Doctor) { // instanceof should indicate bad code - make obvious wout checking
			prescribeMedicine();
			diagnosePatient();
		}
	}
	
	//Nurses
	private void checkVitalSigns() {
		System.out.println("checking vitals");
	}
	private void drawBlood() {
		System.out.println("drawing blood");
	}
	private void cleanPatientArea() {
		System.out.println("cleaning area");
	}
	// Doctors
	private void prescribeMedicine() {
		System.out.println("prescribing medicine");
	}
	private void diagnosePatient() {
		System.out.println("diagnosing");
	}
}
