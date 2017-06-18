package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.entity.Pedidos;

public class MySQLPedidosDao implements PedidosDao{
	
	Connection con = null;
	PreparedStatement ps;
	ResultSet rs = null;
	
	@Override
	public void incluirPedido(Pedidos pedido) throws Exception {
		
		try {
			con = MySQLDaoFactory.criarConexao();
			
			ps = con.prepareStatement("INSERT INTO PEDIDOS (IDCLIENTE, DATA, DESCRICAO, VALOR) VALUES (?,?,?,?)");
			ps.setInt(1, pedido.getIdCliente()); 
			ps.setDate(2, new Date(pedido.getData().getTime())); 
			ps.setString(3, pedido.getDescricao());
			ps.setDouble(4, pedido.getValor());
			ps.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			con.close();
		}
	}
	@Override
	public List<Pedidos> listarPedidos(int idCliente) throws Exception {
		List<Pedidos> pedidos = new ArrayList<Pedidos>();
		try {
			con = MySQLDaoFactory.criarConexao();
			
			ps = con.prepareStatement("SELECT IDPEDIDO, DATA, DESCRICAO, VALOR FROM PEDIDOS WHERE IDCLIENTE = ?");
			ps.setInt(1, idCliente);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Pedidos pedido = new Pedidos(
						rs.getInt("IDPEDIDO"),
						rs.getInt("IDCLIENTE"), 
						rs.getDate("DATA"), 
						rs.getString("DESCRICAO"),  
						rs.getDouble("VALOR"));
				
				pedidos.add(pedido);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			throw e;
		}finally {
			ps.close();
		}
		return pedidos;
	
	}
}