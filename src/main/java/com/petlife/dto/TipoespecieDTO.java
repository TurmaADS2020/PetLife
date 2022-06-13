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
public class TipoespecieDTO {
	
private int idtipoespecie;
public String especie;
public String raca;
public String descricao;


}
