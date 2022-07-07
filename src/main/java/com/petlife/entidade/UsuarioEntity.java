package com.petlife.entidade;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

//import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_usuario")
	private Long id;
	
	@Column(name = "ativo")
	private Long ativo;
	
	@BatchSize(size= 11)
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name= "data_cadastro")
	private LocalDate dataCadastro;

	//@NotNull
	@Column(name= "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
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
	
	@Column(name = "numero_casa")
	private Long numeroCasa;
}
