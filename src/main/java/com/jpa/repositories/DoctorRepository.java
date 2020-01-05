package com.jpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.entities.DoctorEntity;

@Repository
@Transactional
public class DoctorRepository {
	private EntityManager em;

	public void save(DoctorEntity doctor) {
		em.persist(doctor);
	}

	public DoctorEntity getById(Long id) {

		return em.find(DoctorEntity.class, id);

	}

	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

}
