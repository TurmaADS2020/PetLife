package com.petlife.dto;


import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AnimalDTO {
	
	private Long id;
	private LocalDate dataCadastro;
	private String nome;
	private String porte;
	private String sexo;
	private String temperamento;
	private String relato;
	private String raca;
	private Long idade;
	private String castrado;
	private String vacinado;
}
