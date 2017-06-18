package br.com.fiap.dao;

import java.sql.SQLException;

import br.com.fiap.entity.Pedido;

public class PedidosDAO extends Dao{
	public Pedido incluirPedido(Pedido p) throws SQLException{
		abrirConexao();
		
		String sql = "INSERT INTO PEDIDOS"
				+ "(IDCLIENTE, DATA, DESCRICAO, VALOR) VALUES(?, ?, ?, ?)";
		
		ps=con.prepareStatement(sql);
		
		return null;
	}
}
