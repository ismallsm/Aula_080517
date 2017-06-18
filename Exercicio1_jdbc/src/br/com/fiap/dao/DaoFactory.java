package br.com.fiap.dao;
public abstract class DaoFactory {
	//Lista de tipos suportados pelo factory
	public static final int MYSQL = 1;
		
	//Teremos um metodo para cada DAO criado. As classes "factory" concretas implementarao estes metodos
	public abstract ClientesDao getClientesDao();
	
	public abstract PedidosDao getPedidosDao();
	
	public static DaoFactory getDaoFactory(int tipo){
		switch(tipo){
			case MYSQL: return new MySQLDaoFactory();
			default: return null;
		}
	}
}