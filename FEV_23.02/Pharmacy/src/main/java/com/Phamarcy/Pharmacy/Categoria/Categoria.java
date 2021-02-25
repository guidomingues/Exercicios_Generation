package com.Phamarcy.Pharmacy.Categoria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Categoria")
public class Categoria {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id; 
	@NotNull
	private String Produto; 
	@NotNull
	private String ObrigatorioReceita;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProduto() {
		return Produto;
	}
	public void setProduto(String produto) {
		Produto = produto;
	}
	public String getObrigatorioReceita() {
		return ObrigatorioReceita;
	}
	public void setObrigatorioReceita(String obrigatorioReceita) {
		ObrigatorioReceita = obrigatorioReceita;
	} 
	
	
}
