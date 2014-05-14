package com.frencoret.coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class Coneccion {
	
private Connection cnn;
	
	public Coneccion() {
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			cnn=DriverManager.getConnection("jdbc:mysql://10.0.2.2/twimpi","root","root");
			
		}catch(Exception e){
			Logger x=Logger.getLogger("conexion");
			x.warning("error conexion:"+e.getMessage());
			
		}
		
		}
		
		public Connection getConexion(){
			
			return cnn;
		}

}
