package com.udemy.hospital.donebetter;

import com.udemy.hospital.donewrong.Employee;

public class Nurse1 extends Employee1 {

	public Nurse1(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("Nurse1 created");
	}
	
	private void checkVitalSigns() {
		System.out.println("checking vitals");
	}
	private void drawBlood() {
		System.out.println("drawing blood");
	}
	private void cleanPatientArea() {
		System.out.println("cleaning area");
	}

	@Override
	public void performDuties() {
		cleanPatientArea();
		drawBlood();
		checkVitalSigns();	
	}

}
