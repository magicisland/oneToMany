package com.mjr.relations.oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Mentor {

	@Id
	@GeneratedValue
	protected int idMentor;
	
	@Column
	protected String nombre;
	
	
	public int getIdMentor() {
		return idMentor;
	}


	public void setIdMentor(int idMentor) {
		this.idMentor = idMentor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Modulo> getModulos() {
		return modulos;
	}


	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}

	@ManyToMany
	@JoinTable(name="association", joinColumns={@JoinColumn(name="idMentor")},inverseJoinColumns={@JoinColumn(name="idModulo")})
	protected List<Modulo> modulos = new ArrayList<Modulo>();
	
	
	
}
