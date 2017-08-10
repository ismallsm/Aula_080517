package br.com.fiap;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Busca {

	public static void main(String[] args) throws Exception, RemoteException, NotBoundException {
		Carrinho carrinho = (Carrinho)
				Naming.lookup("rmi://10.20.74.41:1099/farmacia/carrinho");
		Item item = new Item();
		item.setNome("Para com isso aí mané!");
		item.setPreco(1000.00);
		carrinho.cadastrarItem(item);
	}

}
