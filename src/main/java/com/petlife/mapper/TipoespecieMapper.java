package com.petlife.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import com.petlife.dto.TipoespecieDTO;
import com.petlife.entidade.TipoespecieEntity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class TipoespecieMapper {
private ModelMapper modelMapper;
	
	public TipoespecieEntity toEntity(TipoespecieDTO dto) {
		return modelMapper.map(dto, TipoespecieEntity.class);
	}
	
	public TipoespecieDTO toDto(TipoespecieEntity obj) {
		return modelMapper.map(obj, TipoespecieDTO.class);
	}
}

