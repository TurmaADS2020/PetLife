package com.petlife.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.petlife.dto.AnimalDTO;
import com.petlife.entidade.AnimalEntity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class AnimalMapper {

	private ModelMapper modelMapper;

	public AnimalEntity toEntity(AnimalDTO dto) {
		return modelMapper.map(dto, AnimalEntity.class);
	}

	public AnimalDTO toDto(AnimalEntity obj) {
		return modelMapper.map(obj, AnimalDTO.class);
	}
}
