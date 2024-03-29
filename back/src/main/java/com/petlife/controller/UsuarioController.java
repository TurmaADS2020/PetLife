package com.petlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.petlife.dto.UsuarioDTO;
import com.petlife.repository.UsuarioRepository;
import com.petlife.service.UsuarioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> listUsuario() throws Exception{
		List<UsuarioDTO> lista = this.usuarioService.listUsuario();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = {"/{id}"})
	public ResponseEntity<UsuarioDTO> salvarUsuario(@PathVariable("id")Long id) throws Exception{
		UsuarioDTO salvar = this.usuarioService.finBydId(id);
		return ResponseEntity.ok().body(salvar);
	}
	
	@PostMapping
	public ResponseEntity<UsuarioDTO> salvarUsuario(@RequestBody UsuarioDTO usuario) throws Exception{
		UsuarioDTO salvar = this.usuarioService.salvarUsuario(usuario);
		return ResponseEntity.ok().body(salvar);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) throws Exception {
		usuarioService.removerUsuario(id);
	}
}
