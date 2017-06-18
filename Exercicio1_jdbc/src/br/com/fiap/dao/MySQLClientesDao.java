package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Pedidos;

public class MySQLClientesDao implements ClientesDao{ 
	
	Connection con = null;
	PreparedStatement ps;
	ResultSet rs = null;
	
	@Override
	public void inserirCliente(Clientes cliente) throws Exception{
		try {
			con = MySQLDaoFactory.criarConexao();
			ps = con.prepareStatement("INSERT INTO CLIENTES (NOME, EMAIL) VALUES (?,?,?)");
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getEmail()); 
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			while(rs.next()){
				cliente.setId(rs.getInt("IDCLIENTE"));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			con.close();
		}
	}
	
	@Override
	public Clientes buscarCliente(int id) throws Exception{
		Clientes cliente = null;
		List<Pedidos> pedidos = new ArrayList<Pedidos>();
		
		con = MySQLDaoFactory.criarConexao();
		
		String sql = "SELECT IDPEDIDO, DATA, DESCRICAO, VALOR "
				+ "FROM PEDIDOS "
				+ "WHERE IDCLIENTE = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while(rs.next()){
			pedidos.add(new Pedidos(rs.getInt("IDPEDIDO"), 
					id, 
					rs.getDate("DATA"), 
					rs.getString("DESCRICAO"), 
					rs.getDouble("VALOR")));
		}
		con.close();
		rs.close();
		ps.close();
		
		sql = "SELECT NOME, EMAIL FROM CLIENTES WHERE ID = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		rs = ps.executeQuery();
		if(rs.first()){
			cliente = new Clientes(id, 
					rs.getString("NOME"), 
					rs.getString("EMAIL"), 
					pedidos);
		}
		con.close();
		rs.close();
		ps.close();
		
		return cliente;
	}
}