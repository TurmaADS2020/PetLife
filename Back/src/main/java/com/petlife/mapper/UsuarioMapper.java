package com.petlife.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.petlife.dto.UsuarioDTO;
import com.petlife.entidade.UsuarioEntity;

import lombok.AllArgsConstructor;

//@Mapper(config = PetLifeMapperConfig.class)

@AllArgsConstructor
@Component
public class UsuarioMapper {
	 
		private ModelMapper modelMapper;
		
		public UsuarioEntity toEntity(UsuarioDTO dto) {
			return modelMapper.map(dto, UsuarioEntity.class);
		}
		
		public UsuarioDTO toDto(UsuarioEntity obj) {
			return modelMapper.map(obj, UsuarioDTO.class);
		}
	
//		List<UsuarioEntity> map(List<UsuarioDTO> listDTO);
	
		public List<UsuarioDTO> mapByListObj(List<UsuarioEntity> listEntity) {
			return listEntity.stream()
					.map(this::toDto)
					.collect(Collectors.toList());
		}
		
//		List<UsuarioDTO> mapByListObjOrdenados(List<UsuarioDTO> listEntity);
		
//		@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE) 
//		 ignora os campos nulos
//		void updateFromDto(UsuarioDTO dto, @MappingTarget UsuarioEntity obj);


}
