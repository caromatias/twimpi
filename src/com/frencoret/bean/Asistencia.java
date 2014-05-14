package com.frencoret.bean;

public class Asistencia {
	
	
	private int id;
	
	private int idUsuario;
	
	private int idEvento;
	
	
	public Asistencia(int id, int idUsuario, int idEvento){
		
		this.id=id;
		this.idUsuario=idUsuario;
		this.idEvento=idEvento;
		
		
	}
	
	public Asistencia(){
		
		this.id=0;
		this.idUsuario=0;
		this.idEvento=0;
		
		
	}
	

	private int getId() {
		return id;
	}

	

	private int getIdUsuario() {
		return idUsuario;
	}

	
	
	private int getIdEvento() {
		return idEvento;
	}
	
	
	
	
	private void setId(int id) {
		this.id = id;
	}
	private void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	private void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	

}
