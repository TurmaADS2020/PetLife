package com.petlife.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.petlife.dto.UsuarioDTO;
import com.petlife.entidade.UsuarioEntity;
import com.petlife.mapper.ArquivoMapper;
import com.petlife.mapper.EnderecoMapper;
import com.petlife.mapper.UsuarioMapper;
import com.petlife.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioMapper usuarioMapper;
	
	@Autowired
	private EnderecoMapper enderecoMapper;
	
	@Autowired
	private ArquivoMapper arquivoMapper;
	
	@Transactional(readOnly = true)
	public List<UsuarioDTO> listUsuario() {
		
		return this.usuarioMapper.mapByListObj(usuarioRepository.findAll());
	}
	
	@Transactional(readOnly = true)
	public UsuarioDTO finBydId(Long id) throws Exception {
		Optional<UsuarioEntity> usuarioEntity = existeUsuario(id);
		UsuarioEntity entity = usuarioEntity.get();

		return converterParaDTO(entity);
	}
	
	@Transactional 
	public UsuarioDTO salvarUsuario(UsuarioDTO dto) throws Exception{
			
			UsuarioEntity entity = new UsuarioEntity();
			
			entity.setId(dto.getId());
			entity.setIdEndereco(enderecoMapper.toEntity(dto.getEndereco()));
			entity.setIdArquivo(arquivoMapper.toEntity(dto.getArquivo()));
			entity.setAtivo(dto.getAtivo());
			entity.setCpf(dto.getCpf());
			entity.setDataCadastro(dto.getDataCadastro());
			entity.setNome(dto.getNome());
			entity.setEmail(dto.getEmail());
			entity.setSenha(dto.getSenha());
			entity.setTelefone(dto.getTelefone());
			
			return converterParaDTO(this.usuarioRepository.save(entity));
		
	}
	
	@SuppressWarnings("deprecation")
	@Transactional
	public void removerUsuario(Long id) throws Exception {
		try {
			Optional<UsuarioEntity> usuarioEntity = existeUsuario(id);
			if (!StringUtils.isEmpty(usuarioEntity)) {
				this.usuarioRepository.deleteById(id);
			}
		} catch (Exception e) {
			log.error("<ERRO> UsuarioService.removerUsuario(Long id)" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private UsuarioDTO converterParaDTO(UsuarioEntity entity) {
		return this.usuarioMapper.toDto(entity);
	}
	 
	private Optional<UsuarioEntity> existeUsuario(Long id) throws Exception {

		Optional<UsuarioEntity> optional = usuarioRepository.findById(id);
		if (!optional.isPresent()) {
			System.out.println("Usuario não encontrado!");
		}
		return optional;
		
	}
}
