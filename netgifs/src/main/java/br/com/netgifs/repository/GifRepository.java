package br.com.netgifs.repository;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.netgifs.model.FavoritoModel;
import br.com.netgifs.model.PessoaModel;
import br.com.netgifs.repository.entity.FavoritosEntity;
import br.com.netgifs.repository.entity.GifEntity;
import br.com.netgifs.repository.entity.PessoaEntity;
import br.com.netgifs.repository.entity.UsuarioEntity;
import br.com.netgifs.utils.Util;

public class GifRepository implements Serializable {
	EntityManager entityManager;
	 
	private static final long serialVersionUID = 1L;
 
	public List<GifEntity> buscarGifs(){
 
		try {
 
			//QUERY QUE VAI SER EXECUTADA (GifEntity.findGif) 	
			Query query = Util.JpaEntityManager().createNamedQuery("GifEntity.findGif");
 

			return (List<GifEntity>)query.getResultList();
 
		} catch (Exception e) {
 
			return null;
		}
 
 
 
	}
	
	public List<GifEntity> buscarGifsByCategoria(int categoria){
		 
		try {
 
			//QUERY QUE VAI SER EXECUTADA (GifEntity.findGif) 	
			Query query = Util.JpaEntityManager().createQuery("SELECT g FROM GifEntity g where g.categoria = :idCategoria");
			return query.setParameter("idCategoria", categoria).getResultList();

 
		} catch (Exception e) {
 
			return null;
		}
 
	}
	
	
	
	public void salvarFavorito(FavoritoModel favorito){
		 
			entityManager =  Util.JpaEntityManager();
	 
			FavoritosEntity favoritoEntity = new FavoritosEntity();
			favoritoEntity.setGifEntity(favorito.getIdGif());
			favoritoEntity.setUsuarioEntity(favorito.getIdUsuario());
	 
			entityManager.persist(favoritoEntity);
	 
 
	}
	

}
