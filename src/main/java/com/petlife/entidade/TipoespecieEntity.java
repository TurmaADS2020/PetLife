package com.petlife.entidade;



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
@Table(name = "tipoespecie")
public class TipoespecieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="idtipoespecie")
	private int idtipoespecie;
	
	@Column(name ="especie")
	public String especie;
	
	@Column(name ="raca")
	public LongVarcharTypeDescriptor raca;
	
	@Column(name ="descricao")
	public LongVarcharTypeDescriptor descricao;
	

}
