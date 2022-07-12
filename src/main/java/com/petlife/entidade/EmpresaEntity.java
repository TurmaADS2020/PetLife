package com.petlife.entidade;

import java.time.LocalDate;

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
	private Long id;
	
//	@ManyToOne
//	@JoinColumn(name = "endereco_idendereco")
//	private EnderecoEntity idEndereco;
	
	@Column(name ="ativo")
	private Long ativo;
		
	@Column(name ="nome")
	private String nome;
	
	@Column(name ="natureza")
	private String natureza;
	
	@Column(name ="cnpj")
	private String cnpj;
	
	@Column(name= "data_cadastro")
	private LocalDate dataCadastro;
			
	@Column(name ="responsavel")
	private String responsavel;
	
	@Column(name ="email")
	private String email;

	@Column(name ="senha")
	private String senha;
	
	@Column(name = "telefone")
	private Long telefone;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "uf")
	private String uf;
	
	@Column(name = "referencia")
	private String referencia;
	
	@Column(name = "numero_empresa")
	private Long numeroEmpresa;
	
}


