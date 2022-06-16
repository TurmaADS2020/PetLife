package com.petlife.entidade;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "endereco_idendereco")
	private EnderecoEntity idEndereco;
	
	//TODO
	@ManyToOne
	@JoinColumn(name = "arquivo_idarquivo")
	private ArquivoEntity idArquivo;
	
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
}
