package com.mjr.relations.oneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CorreoElectronico {

	@Id
	@GeneratedValue
	protected int idCorreo;
	@GeneratedValue
	protected String dirección;
	
	
	@ManyToOne
	@JoinColumn(name="idProfesor")
	protected Profesor profesor;


	public int getIdCorreo() {
		return idCorreo;
	}


	public void setIdCorreo(int idCorreo) {
		this.idCorreo = idCorreo;
	}


	public String getDirección() {
		return dirección;
	}


	public void setDirección(String dirección) {
		this.dirección = dirección;
	}


	public Profesor getProfesor() {
		return profesor;
	}


	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	public CorreoElectronico(int idCorreo, String dirección, Profesor profesor) {
		super();
		this.idCorreo = idCorreo;
		this.dirección = dirección;
		this.profesor = profesor;
	}


	public CorreoElectronico() {
		// TODO Auto-generated constructor stub
	}
	
}
