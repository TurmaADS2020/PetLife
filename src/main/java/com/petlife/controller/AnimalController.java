package com.petlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petlife.dto.AnimalDTO;
import com.petlife.service.AnimalService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	private AnimalService animalService;
	
	@PostMapping
	public ResponseEntity<AnimalDTO> salvarUsuario(@RequestBody AnimalDTO animalDTO) throws Exception{
		AnimalDTO salvar = this.animalService.salvarAnimal(animalDTO);
		return ResponseEntity.ok().body(salvar);
	}
}
