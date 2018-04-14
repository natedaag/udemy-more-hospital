package com.udemy.hospital.donebetter;

import com.udemy.hospital.donewrong.Doctor;
import com.udemy.hospital.donewrong.Employee;
import com.udemy.hospital.donewrong.HospitalManagement;
import com.udemy.hospital.donewrong.Nurse;

public class EmergencyRoomProcess1 {
	public static void main(String[] args) {
		HospitalManagement ErDirector = new HospitalManagement();
		Employee peggy = new Nurse(1, "Peggy", "emergency", true);
		ErDirector.callUpon(peggy);
		
		Employee denise	= new Doctor(2, "Denise", "emergency", true);
		ErDirector.callUpon(denise);
	}
	
}
