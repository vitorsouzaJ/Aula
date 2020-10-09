package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class FabricaDeConexoes {
	
	private static FabricaDeConexoes instance;
	
	
	private FabricaDeConexoes() {}
	
	public static FabricaDeConexoes getInstance() {
		if(instance == null) {
			instance = new FabricaDeConexoes();
		}
		return instance;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
		    conn = DriverManager.getConnection("jdbc:sqlite:banco_de_dados.db");
		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		return conn;
	}

}
