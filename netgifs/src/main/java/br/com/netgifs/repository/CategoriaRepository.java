package br.com.netgifs.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import br.com.netgifs.repository.entity.CategoriaEntity;
import br.com.netgifs.repository.entity.GifEntity;
import br.com.netgifs.utils.Util;

public class CategoriaRepository implements Serializable {
	 
	 
	private static final long serialVersionUID = 1L;
 
	public List<CategoriaEntity> buscarCategorias(){
 
		try {
 
			Query query = Util.JpaEntityManager().createNamedQuery("CategoriaEntity.findCategoria");
 

			return (List<CategoriaEntity>)query.getResultList();
 
		} catch (Exception e) {
 
			return null;
		}
 
 
 
	}

}
