package br.com.fiap.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Forum;
import br.com.fiap.entity.Usuario;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("Aula_310517");
		
		
		EntityManager em = entityManagerFactory.createEntityManager();
		
		ForumHelper helper = new ForumHelper(em);
		
		Forum forum = new Forum();
		forum.setAssunto("Java Persistence");
		forum.setDescricao("Discussão de JPA");
		
		System.out.println(helper.salvar(forum));
		
		Usuario usuario = new Usuario();
		usuario.setEmail("teste@fiap.com");
		usuario.setNome("Teste Fiap");
		
		helper.adicionarUsuario(forum.getId(), usuario);

	}

}
