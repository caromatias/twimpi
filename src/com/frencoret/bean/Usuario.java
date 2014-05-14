package com.frencoret.bean;

import android.R.string;

public class Usuario {

	private int id;
	private String nombre;
	private String apellido;
	private int fono;
	
	
	  public Usuario(int id, String nombre, String apellido,int fono) {
	        this.id = id;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.fono=fono;
	    }
	
	  public Usuario(){
		  
		  
		  this.id=0;
		  this.nombre=null;
		  this.apellido=null;
		  this.fono=0;
			
		  
	  }
	
	
	  public int getId() {
		return id;
	}
	
	  public String getNombre() {
		return nombre;
	}
	
	  public String getApellido() {
		return apellido;
	}
	
	  public int getFono() {
		return fono;
	}
	
	
	
	  public void setFono(int fono) {
		this.fono = fono;
	}
	  public void setId(int id) {
		this.id = id;
	}
	  public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	  public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
