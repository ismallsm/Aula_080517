package br.com.fiap.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Time;

public class Helper {
	private EntityManager em;
	public Helper(EntityManager em){
		this.em = em;
	}
	/*public void salvar(Funcionario funcionario) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(funcionario);
			em.getTransaction().commit();
		}
		catch (Exception e) {
			throw e;
		} finally {
			//em.close();
		}
	}*/
	/*//JPQL: Usando Query
	@SuppressWarnings("unchecked")
	public List<Funcionario> listarFuncionarios(){
		Query query = em.createQuery("select f from Funcionario f");
		return query.getResultList();
	}
	public Funcionario buscarFuncionario(String numMatricula){
		Query query = em.createQuery("select f from Funcionario f where matricula = :matricula");
				query.setParameter("matricula", numMatricula);
				Funcionario f = (Funcionario)query.getSingleResult();
				return f;
	}*/
	//JPQL: usando NamedQuery
	@SuppressWarnings("unchecked")
	public List<Time> listarTodosTimes(){
		Query query = em.createNamedQuery("Time.findAll");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Jogador> listarTodosJogadores(){
		Query query = em.createNamedQuery("Jogador.findAll");
		return query.getResultList();
	}
}
