package com.mjr.relations.oneToMany;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Profesor {
	
	@Id
	@GeneratedValue
	public int idProfesor;
	
	@Column
	public String nombre;
	
	
	@OneToMany(mappedBy="profesor",cascade= CascadeType.ALL)
	protected List<CorreoElectronico> correosElectronicos=new ArrayList<CorreoElectronico>();

	public Profesor() {
		super();
		this.idProfesor = idProfesor;
		this.nombre = nombre;
		this.correosElectronicos = correosElectronicos;
	}


	public int getIdProfesor() {
		return idProfesor;
	}


	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
