package com.frencoret.bean;

public class UsuarioEvento {
	
	private int id;
	private int idEvento;
	private int idUsuario;
	
	
	public UsuarioEvento(int id, int idEvento, int idUsuario){
	
	
		this.id=id;
		this.idEvento=idEvento;
		this.idUsuario=idUsuario;
		
	}
	
	public UsuarioEvento(){
		
		this.id=0;
		this.idEvento=0;
		this.idUsuario=0;
		
	}
	
	
	
	private int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	private int getIdEvento() {
		return idEvento;
	}
	
	private void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	
	private int getIdUsuario() {
		return idUsuario;
	}
	
	private void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	

}
