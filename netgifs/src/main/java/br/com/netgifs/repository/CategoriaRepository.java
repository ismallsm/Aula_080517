package br.com.netgifs.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.netgifs.model.CategoriaModel;
import br.com.netgifs.repository.entity.CategoriaEntity;
import br.com.netgifs.utils.Util;

public class CategoriaRepository {
	
	@Inject
	CategoriaEntity categoriaEntity;
	
	EntityManager entityManager;
		 
	public List<CategoriaEntity> buscarCategorias(){
 
		try {
 
			Query query = Util.JpaEntityManager().createNamedQuery("CategoriaEntity.findCategoria");
 

			return (List<CategoriaEntity>)query.getResultList();
 
		} catch (Exception e) {
 
			return null;
		}
 
	}
	
	public void salvarCategoria(CategoriaModel categoriaModel) {
		
		entityManager =  Util.JpaEntityManager();
		
		categoriaEntity = new CategoriaEntity();
		categoriaEntity.setNome(categoriaModel.getNomeCategoria());
		
		entityManager.persist(categoriaEntity);
	}

}
