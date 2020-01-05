package com.jpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.entities.PatientEntity;

@Repository
@Transactional
public class PatientRepository {

	private EntityManager etm;

	public void save(PatientEntity patient) {
		etm.persist(patient);

	}

	public EntityManager getEtm() {
		return etm;
	}

	@PersistenceContext
	public void setEtm(EntityManager etm) {
		this.etm = etm;
	}
}
