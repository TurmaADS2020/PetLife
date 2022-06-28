package com.petlife.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petlife.dto.LoginUsuarioDTO;
import com.petlife.entidade.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

	public Optional<UsuarioEntity> findByEmail(String email);

	public void existsByEmail(String email);
}
