package com.petlife.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petlife.entidade.TipoespecieEntity;

@Repository
public interface TipoespecieRepository extends JpaRepository<TipoespecieEntity, Long> {

}