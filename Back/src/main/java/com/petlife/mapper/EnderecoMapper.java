package com.petlife.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.petlife.dto.EnderecoDTO;
import com.petlife.entidade.EnderecoEntity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EnderecoMapper {

	private ModelMapper modelMapper;
	
	public EnderecoEntity toEntity(EnderecoDTO dto) {
		return modelMapper.map(dto, EnderecoEntity.class);
	}
	
	public EnderecoDTO toDto(EnderecoEntity obj) {
		return modelMapper.map(obj, EnderecoDTO.class);
	}
}
