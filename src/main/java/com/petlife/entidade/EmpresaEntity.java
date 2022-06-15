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
@Table(name = "empresa")
public class EmpresaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="idempresa")
	private Long idempresa;
	
	@Column(name ="ativo")
	private Long ativo;
		
	@Column(name ="nome")
	private String nome;
	
	@Column(name ="natureza")
	private String natureza;
	
	@Column(name ="cnpj")
	private Long cnpj;
			
	@Column(name ="responsavel")
	private String responsavel;
	
	@Column(name ="email")
	private String email;

	@Column(name ="senha")
	private Long senha;
	
	@Column(name ="endereco_idendereco")
	private Long endereco_idendereco;
}


