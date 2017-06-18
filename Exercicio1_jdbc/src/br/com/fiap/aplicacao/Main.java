package br.com.fiap.aplicacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.dao.ClientesDao;
import br.com.fiap.dao.DaoFactory;
import br.com.fiap.dao.PedidosDao;
import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Pedidos;

public class Main {

	public static void main(String[] args) {
		try {
			ClientesDao clientesDao = DaoFactory.getDaoFactory(DaoFactory.MYSQL).getClientesDao();
			PedidosDao pedidosDao = DaoFactory.getDaoFactory(DaoFactory.MYSQL).getPedidosDao();
			List<Pedidos> listaPedidos = new ArrayList<Pedidos>();
			
			Clientes cliente = new Clientes();
			cliente.setNome("Bernardo");
			cliente.setEmail("bernardo@gmail.com");
			clientesDao.inserirCliente(cliente);
			
			Pedidos pedido = new Pedidos();
			pedido.setIdCliente(cliente.getId());
			pedido.setData(new Date());
			pedido.setDescricao("Capacete NoRisk");
			pedido.setValor(350.00);
			listaPedidos.add(pedido);
			
			pedido = new Pedidos();
			pedido.setIdCliente(cliente.getId());
			pedido.setData(new Date());
			pedido.setDescricao("Viseira NoRisk Fume");
			pedido.setValor(50.00);
			listaPedidos.add(pedido);
			
			for(Pedidos p: listaPedidos){
				pedidosDao.incluirPedido(p);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
