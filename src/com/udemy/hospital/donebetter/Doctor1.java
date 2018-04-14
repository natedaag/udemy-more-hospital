package com.udemy.hospital.donebetter;

import com.udemy.hospital.donewrong.Employee;

public class Doctor1 extends Employee1 {

	public Doctor1(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("doctor1 created");
	}
	
	private void prescribeMedicine() {
		System.out.println("prescribing medicine");
	}
	private void diagnosePatient() {
		System.out.println("diagnosing");
	}

	@Override
	public void performDuties() {
		diagnosePatient();
		prescribeMedicine();
	}
}
