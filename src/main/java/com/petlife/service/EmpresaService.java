package com.petlife.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.petlife.dto.EmpresaDTO;
import com.petlife.entidade.EmpresaEntity;
import com.petlife.mapper.ArquivoMapper;
import com.petlife.mapper.EmpresaMapper;
import com.petlife.mapper.EnderecoMapper;
import com.petlife.repository.EmpresaRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private EmpresaMapper empresaMapper;

//	@Autowired
//	private EnderecoMapper enderecoMapper;
//	
//	@Autowired 
//	private ArquivoMapper arquivoMapper;

	
	public List<EmpresaDTO> listEmpresa() {
		
		return this.empresaMapper.mapByListObj(empresaRepository.findAll());
	}
	
	@Transactional
	public EmpresaDTO finBydId(Long id) throws Exception {
		Optional<EmpresaEntity> empresaEntity = existeEmpresa(id);
		EmpresaEntity entity = empresaEntity.get();
		
		return converterParaDTO(entity);
	}
	
	@Transactional
	public EmpresaDTO salvarEmpresa(EmpresaDTO dto) throws Exception{
	
		EmpresaEntity entity = new EmpresaEntity();
	
		entity.setId(dto.getId());
		entity.setAtivo(dto.getAtivo());
		entity.setNome(dto.getNome());
		entity.setNatureza(dto.getNatureza());
		entity.setCnpj(dto.getCnpj());
		entity.setDataCadastro(dto.getDataCadastro());
		entity.setResponsavel(dto.getResponsavel());
		entity.setEmail(dto.getEmail());
		entity.setSenha(dto.getSenha());
		entity.setTelefone(dto.getTelefone());
		entity.setRua(dto.getRua());
		entity.setBairro(dto.getBairro());
		entity.setCidade(dto.getCidade());
		entity.setCep(dto.getCep());
		entity.setUf(dto.getUf());
		entity.setReferencia(dto.getReferencia());
		entity.setNumeroEmpresa(dto.getNumeroEmpresa());
		
		return converterParaDTO(this.empresaRepository.saveAndFlush(entity));
		
}
	

	@SuppressWarnings("deprecation")
	@Transactional
	public void removerEmpresa(Long idempresa) throws Exception {
		try {
			Optional<EmpresaEntity> empresaEntity = existeEmpresa(idempresa);
			if (!StringUtils.isEmpty(empresaEntity)) {
				this.empresaRepository.deleteById(idempresa);
			}
		} catch (Exception e) {
			log.error("<ERRO> empresaService.removerEmpresa(Long id)" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private EmpresaDTO converterParaDTO(EmpresaEntity entity) {
		return this.empresaMapper.toDto(entity);
	}
	 
	private Optional<EmpresaEntity> existeEmpresa(Long idempresa) throws Exception {

		Optional<EmpresaEntity> optional = empresaRepository.findById(idempresa);
		if (!optional.isPresent()) {
			System.out.println(" não encontrado!");
		}
		return optional;
		
	}


//	public List<EmpresaDTO> listEmpresa() {
//		// TODO Auto-generated method stub
//		return null;
//	}


//	public EmpresaDTO finBydid(Long idempresa) {
//		
//		return null;
//	}
}	

