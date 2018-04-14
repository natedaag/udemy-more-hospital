package com.udemy.hospital.donewrong;

public class EmergencyRoomProcess {
	public static void main(String[] args) {
		HospitalManagement ErDirector = new HospitalManagement();
		Employee peggy = new Nurse(1, "Peggy", "emergency", true);
		ErDirector.callUpon(peggy);
		
		Employee denise	= new Doctor(2, "p", "mm", true);
		ErDirector.callUpon(denise);
	}
	
}
