package com.petlife.entidade;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.type.descriptor.sql.LongVarcharTypeDescriptor;

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
	private int idanimal;
	
	@Column(name ="tipoEspecie")
	public String tipoEspecie;
	
	@Column(name ="dat_cadastro")
	public LocalDateTime dat_cadastro;
	
	@Column(name ="nome")
	public LongVarcharTypeDescriptor nome;
	
	@Column(name ="porte")
	public LongVarcharTypeDescriptor porte;
	
	@Column(name ="sexo")
	public LongVarcharTypeDescriptor sexo;
	
		
	@Column(name ="temperamento")
	private String temperamento;
	
	@Column(name ="observacao")
	public String observacao;

}


