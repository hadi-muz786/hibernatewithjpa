package com.jpa.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.entities.DoctorEntity;
import com.jpa.repositories.DoctorRepository;

public class DocterSelectMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		DoctorRepository dr = (DoctorRepository) ctx.getBean("doctorRepository");
		DoctorEntity dctr = dr.getById(1l);
		System.out.println(dctr.toString());

	}

}
