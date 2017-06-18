package br.com.fiap.helper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.fiap.core.Helper;
import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Time;

public class Main {

	private EntityManager em;
	public Main(EntityManager em){
		this.em = em;
	}

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AtividadeFinalJPA");

		EntityManager em = entityManagerFactory.createEntityManager();

		Helper dao = new Helper(em);
		
		int option = 0;  

		do {  
			option = menu();  
			switch (option) {  
			case 1:  
				List<Time> listTimes = dao.listarTodosTimes();
				for (Time time : listTimes) {
					System.out.println(time.getNomeTime());
				}
				break;
			case 2:
				List<Jogador> listJogadores = dao.listarTodosJogadores();
			
			}  
		} while (option != 0);  

	}  

	public static int menu()  
	{  
		return   Integer.parseInt(javax.swing.JOptionPane.showInputDialog("" +  
                "1 - Buscar Times.\n" +  
                "2 - Buscar Jogador.\n" +  
                "3 - Buscar Patrocio.\n" +  
                "4 - Calcular INSS.\n" +  
                "5 - Calcular salario liquido.\n" +  
                "6 - Mostrar folha de pagamento.\n" +  
                "7 - Sair."));  

	}  
	
}
