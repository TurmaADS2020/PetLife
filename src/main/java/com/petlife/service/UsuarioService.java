package com.petlife.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.petlife.dto.LoginUsuarioDTO;
import com.petlife.dto.UsuarioDTO;
import com.petlife.entidade.UsuarioEntity;
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
	
	//TODO
	//@Autowired
	//private EnderecoMapper enderecoMapper;
	
	//TODO
	//@Autowired
	//private ArquivoMapper arquivoMapper;
	
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
			entity.setAtivo(dto.getAtivo());
			entity.setCpf(dto.getCpf());
			entity.setDataCadastro(dto.getDataCadastro());
			entity.setNome(dto.getNome());
			entity.setEmail(dto.getEmail());
			entity.setSenha(dto.getSenha());
			entity.setTelefone(dto.getTelefone());
			entity.setRua(dto.getRua());
			entity.setBairro(dto.getBairro());
			entity.setCidade(dto.getCidade());
			entity.setCep(dto.getCep());
			entity.setUf(dto.getUf());
			entity.setReferencia(dto.getReferencia());
			entity.setNumeroCasa(dto.getNumeroCasa());
			
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
			log.error("<ERRO> UsuarioService.removerUsuario(Long id)" + 			e.getMessage());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Transactional
	public LoginUsuarioDTO loginUsuario(String email) throws Exception {
		try {
			Optional<UsuarioEntity> usuarioEntity = existeEmailUsuario(email);
			if (!StringUtils.isEmpty(usuarioEntity)) {
				this.usuarioRepository.existsByEmail(email);
			}
		} catch (Exception e) {
			log.error("Usuario inexistente!" + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
//	public User loadUserByUsername(String email) {
//		
//		Optional<UsuarioDTO> usuarioOptional = usuarioRepository.findByEmail(email);
//		UsuarioDTO usuario = usuarioOptional.orElseThrow(() -> 		new	UsernameNotFoundException("Usuario e ou senha invalidos"));
//		
//		return new User(email, usuario.getSenha(), null);
//	}
	
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
	
	private Optional<UsuarioEntity> existeEmailUsuario(String email) throws Exception{

		Optional<UsuarioEntity> optional = usuarioRepository.findByEmail(email);
		if (!optional.isPresent()) {
			System.out.println("E-mail não encontrado!");
		}
		return optional;
	}
}
