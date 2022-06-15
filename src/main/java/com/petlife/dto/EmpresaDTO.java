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

public class EmpresaDTO {
	private Long idempresa;
	private Long ativo;
	private String nome;
	private String natureza;
	private Long cnpj;
	private String responsavel;
	private String email;
	private Long senha;
	private Long endereco_idendereco; 

}
