package com.jpa.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.entities.DoctorEntity;
import com.jpa.repositories.DoctorRepository;

public class CreateDoctorMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		DoctorRepository dr = (DoctorRepository) ctx.getBean("doctorRepository");

		DoctorEntity d1 = new DoctorEntity();
		d1.setName("Dr. Hadi muz");
		d1.setPhone("101010101010");
		d1.setSpeciality("Orthopedics");
		d1.setDepartment("Orthopedy");

		dr.save(d1);

	}

}
