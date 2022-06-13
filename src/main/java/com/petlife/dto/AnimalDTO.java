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
	
	private int idanimal;
	public String tipoespecie;
	public LocalDateTime dat_cadastro;
	public String raca;
	public String sexo;
	public Long nome;
	public Long porte;
	public String temperamento;
	public String observacao;
	

}
