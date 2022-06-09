package com.petlife.dto;

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
public class EnderecoDTO {
	
	private Long idEndereco;
	private String logradouro;
	private String nome;
	private Long numero;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String referencia;
	

}
