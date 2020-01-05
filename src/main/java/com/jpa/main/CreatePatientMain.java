package com.jpa.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpa.entities.PatientEntity;
import com.jpa.repositories.PatientRepository;

public class CreatePatientMain {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("application-context.xml");
		PatientRepository pr = (PatientRepository) ctxt.getBean("patientRepository");

		PatientEntity pe = new PatientEntity();

		Calendar cal2 = Calendar.getInstance();

		cal2.set(Calendar.YEAR, 1998);

		cal2.set(Calendar.MONTH, 4);

		cal2.set(Calendar.DAY_OF_MONTH, 1);

		Date dob = cal2.getTime();

		pe.setName("Ahmad");
		pe.setEmail("xyz@yahoo.com");
		pe.setPhone("0909090909");
		pe.setLastfourssn("9865");
		pe.setDob(dob);

		pr.save(pe);

	}

}
