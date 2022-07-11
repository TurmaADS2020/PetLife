package com.petlife.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petlife.dto.AnimalDTO;
import com.petlife.entidade.AnimalEntity;
import com.petlife.mapper.AnimalMapper;
import com.petlife.repository.AnimalRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;
	
	@Autowired
	private AnimalMapper animalMapper;
	
	@Transactional
	public AnimalDTO salvarAnimal(AnimalDTO dto) throws Exception {
		
		AnimalEntity entity = new AnimalEntity();
		
		entity.setId(dto.getId());
		entity.setDataCadastro(dto.getDataCadastro());
		entity.setNome(dto.getNome());
		entity.setPorte(dto.getPorte());
		entity.setSexo(dto.getSexo());
		entity.setTemperamento(dto.getTemperamento());
		entity.setRelato(dto.getRelato());
		entity.setRaca(dto.getRaca());
		entity.setIdade(dto.getIdade());
		entity.setCastrado(dto.getCastrado());
		entity.setVacinado(dto.getVacinado());
				
		return converteParaDTO(this.animalRepository.save(entity));
	}
	
	private AnimalDTO converteParaDTO(AnimalEntity entity) {
		return this.animalMapper.toDto(entity);
	}
}
