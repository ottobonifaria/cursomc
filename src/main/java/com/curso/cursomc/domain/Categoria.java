package com.curso.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nomeString;
	
	public Categoria() {
		
	}

	public Categoria(Integer id, String nomeString) {
		super();
		this.id = id;
		this.nomeString = nomeString;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
