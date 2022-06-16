package com.petlife.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.petlife.dto.ArquivoDTO;
import com.petlife.entidade.ArquivoEntity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class ArquivoMapper {

private ModelMapper modelMapper;
	
	public ArquivoEntity toEntity(ArquivoDTO dto) {
		return modelMapper.map(dto, ArquivoEntity.class);
	}
	
	public ArquivoDTO toDto(ArquivoEntity obj) {
		return modelMapper.map(obj, ArquivoDTO.class);
	}
}
