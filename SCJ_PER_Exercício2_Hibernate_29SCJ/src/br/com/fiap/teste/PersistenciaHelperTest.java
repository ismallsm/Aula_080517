package br.com.fiap.teste;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Pedidos;
import br.com.fiap.helper.MyHelper;

public class PersistenciaHelperTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SCJ_PER_Exercício2_Hibernate_29SCJ");

		EntityManager em = emf.createEntityManager();
		incluirCliente(em);
		em = emf.createEntityManager();
		listarClientes(em);
		buscarCliente(em, 1);
		em.close();
		System.exit(1);
	}

	private static void incluirCliente(EntityManager em) {
		MyHelper dao = new MyHelper(em);
		Clientes cliente = new Clientes();
		cliente.setEmail("teste@gmail.com");
		cliente.setNome("teste");

		Pedidos pedido = new Pedidos();
		pedido.setCliente(cliente);
		pedido.setData(new Date());
		pedido.setDescricao("nexus");
		pedido.setValor(4000);

		cliente.getPedidos().add(pedido);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, -10);

		Pedidos pedido2 = new Pedidos();
		pedido2.setCliente(cliente);
		pedido2.setData(cal.getTime());
		pedido2.setDescricao("Ipad");
		pedido2.setValor(12000);

		cliente.getPedidos().add(pedido2);

		try {
			dao.salvar(cliente);
			System.out.println("Salvo com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void listarClientes(EntityManager em) {
		MyHelper dao = new MyHelper(em);
		List<Clientes> clientes = dao.listarClientes();
		for (Clientes cliente : clientes) {
			System.out.println(cliente.getNome() + ": " + cliente.getEmail());
		}
	}

	private static void buscarCliente(EntityManager em, Integer idCliente) {
		MyHelper dao = new MyHelper(em);
		Clientes f = dao.buscarCliente(idCliente);
		System.out.println(f.getNome() + ": " + f.getEmail());
	}

}