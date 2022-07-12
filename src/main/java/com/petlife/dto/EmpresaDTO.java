package com.petlife.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class EmpresaDTO {
	private Long id;
	private Long ativo;
	private String nome;
	private String natureza;
	private String cnpj;
	private LocalDate dataCadastro;
	private String responsavel;
	private String email;
	private String senha;
	private Long telefone;
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;
	private String referencia;
	private Long numeroEmpresa;

}
