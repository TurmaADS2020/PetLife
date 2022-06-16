package com.petlife.dto;


import java.time.LocalDateTime;

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
public class AnimalDTO {
	private Long idanimal;
	private String tipoespecie;
	private LocalDateTime dat_cadastro;
	private String raca;
	private String sexo;
	private Long nome;
	private Long porte;
	private String temperamento;
	private String observacao;
	

}
