package com.frencoret.bean;

public class Seguidores {

	private int idUsuario;
	
	private int idUsuario1;
	
	
	public Seguidores(int idUsuario, int idUsuario1){
		
		this.idUsuario=idUsuario;
		this.idUsuario1=idUsuario1;
		
	}
	
	public Seguidores(){
		
		this.idUsuario=0;
		this.idUsuario1=0;
	
		
	}
	
	

	private int getIdUsuario() {
		return idUsuario;
	}

	

	private int getIdUsuario1() {
		return idUsuario1;
	}
	
	private void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	private void setIdUsuario1(int idUsuario1) {
		this.idUsuario1 = idUsuario1;
	}
	
	
	
	
	
}
