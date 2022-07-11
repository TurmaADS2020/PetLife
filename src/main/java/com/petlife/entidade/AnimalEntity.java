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
@Table(name = "animal")
public class AnimalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="idanimal")
	private Long id;
	
	@Column(name ="data_cadastro")
	private LocalDate dataCadastro;
	
	@Column(name ="nome")
	private String nome;
	
	@Column(name ="porte")
	private String porte;
	
	@Column(name ="sexo")
	private String sexo;
	
	@Column(name ="temperamento")
	private String temperamento;
	
	@Column(name ="relato")
	private String relato;
	
	@Column(name ="raca")
	private String raca;
	
	@Column(name ="idade")
	private Long idade;
	
	@Column(name ="castrado")
	private String castrado;
	
	@Column(name ="vacinado")
	private String vacinado;

}


