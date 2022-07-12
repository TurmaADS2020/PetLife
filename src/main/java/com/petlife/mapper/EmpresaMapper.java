package com.petlife.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.petlife.dto.EmpresaDTO;
import com.petlife.entidade.EmpresaEntity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component

public class EmpresaMapper {
private ModelMapper modelMapper;
	
	public EmpresaEntity toEntity(EmpresaDTO dto) {
		return modelMapper.map(dto, EmpresaEntity.class);
	}
	
	public EmpresaDTO toDto(EmpresaEntity obj) {
		return modelMapper.map(obj, EmpresaDTO.class);
	}

	public List<EmpresaDTO> mapByListObj(List<EmpresaEntity> listEntity) {
		return listEntity.stream()
				.map(this::toDto)
				.collect(Collectors.toList());
	}
}
