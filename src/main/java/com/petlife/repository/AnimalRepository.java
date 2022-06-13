package com.petlife.repository;

	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.petlife.entidade.AnimalEntity;

	@Repository
	public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {

	}