package com.udemy.hospital.donewrong;

public class Doctor extends Employee {

	public Doctor(int id, String name, String department, boolean working) {
		super(id, name, department, working);
		System.out.println("doctor created");
	}

}
