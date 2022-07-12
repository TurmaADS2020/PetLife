package com.petlife.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;



import com.petlife.dto.EmpresaDTO;

import com.petlife.service.EmpresaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping
	public ResponseEntity<List<EmpresaDTO>> listEmpresa() throws Exception{
		List<EmpresaDTO> lista = this.empresaService.listEmpresa();
		return ResponseEntity.ok().body(lista); 
	}
	
	@GetMapping(value = {"/{Idempresa}"})
	public ResponseEntity<EmpresaDTO> buscarEmpresa(@PathVariable("Idempresa")Long idempresa) throws Exception{ 
		EmpresaDTO buscar = this.empresaService.finBydId(idempresa);
	return ResponseEntity.ok().body(buscar);
}

	@PostMapping
	public ResponseEntity<EmpresaDTO> salvarEmpresa(@RequestBody EmpresaDTO empresa) throws Exception{
		EmpresaDTO salvar = this.empresaService.salvarEmpresa(empresa);
		return ResponseEntity.ok().body(salvar);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{idempresa}")
	public void remover(@PathVariable Long idEmpresa) throws Exception {
		empresaService.removerEmpresa(idEmpresa);
	}
}
