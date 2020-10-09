package dao;

import java.sql.Connection;

public class BaseDAO {
	
	protected Connection getConnection() {
		return FabricaDeConexoes.getInstance().getConnection();
	}

}
