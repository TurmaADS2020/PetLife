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
public class UsuarioDTO {
	
	private Long id;
	private Long ativo;
	private String cpf;
	private LocalDate dataCadastro;
	private String nome;
	private String email;
	private String senha;
	private Long telefone;
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	private String referencia;
	private Long numeroCasa;

}
