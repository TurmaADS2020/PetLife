package com.petlife.entidade;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tipoespecie")
public class TipoespecieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="idtipoespecie")
	private Long idtipoespecie;
	
	@Column(name ="especie")
	private String especie;
	
	@Column(name ="raca")
	private String raca;
	
	@Column(name ="descricao")
	private String descricao;
	

}
