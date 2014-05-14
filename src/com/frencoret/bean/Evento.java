package com.frencoret.bean;

public class Evento {

	private int id;
	private String nombre;
	private String descripcion;
	private int estado;
	private int cupos;
	private int fecha;
	private String region;
	private String comuna;
	private String direccion;
	
	
	public Evento(int id, String nombre, String descripcion,int estado, int cupos, int fecha, String region, String comuna,String direccion) {
	
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.cupos = cupos;
		this.fecha=fecha;
		this.region=region;
		this.comuna=comuna;
		this.direccion=direccion;
	}
	
	public Evento()
	{
		this.id=0;
		this.nombre=null;
		this.descripcion=null;
		this.estado=0;
		this.cupos=0;
		this.fecha=0;
		this.region=null;
		this.comuna=null;
		this.direccion=null;
		
	}

	
	
	
	private int getId() {
		return id;
	}
	
	private String getNombre() {
		return nombre;
	}
	
	private String getDescripcion() {
		return descripcion;
	}
	
	private int getEstado() {
		return estado;
	}
	
	private int getCupos() {
		return cupos;
	}
	
	private int getFecha() {
		return fecha;
	}
	
	private String getRegion() {
		return region;
	}
	
	private String getComuna() {
		return comuna;
	}
	
	private String getDireccion() {
		return direccion;
	}
	
	
	
	private void setId(int id) {
		this.id = id;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	private void setEstado(int estado) {
		this.estado = estado;
	}
	private void setCupos(int cupos) {
		this.cupos = cupos;
	}
	private void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	private void setRegion(String region) {
		this.region = region;
	}
	private void setComuna(String comuna) {
		this.comuna = comuna;
	}
	
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
