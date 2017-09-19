package br.com.netgifs.repository.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="tb_usuario_favorito")
@Entity	
@NamedQuery(name = "FavoritosEntity.findFavoritos", 
		    query= "SELECT u FROM FavoritosEntity u")
public class FavoritosEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
 

	@Id
	@GeneratedValue
	@Column(name = "id_favorito")
	private String id;
 
	@Column(name="id_usuario")
	private int usuarioEntity;
	
	@Column(name="id_gif")
	private int gifEntity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getUsuarioEntity() {
		return usuarioEntity;
	}

	public void setUsuarioEntity(int usuarioEntity) {
		this.usuarioEntity = usuarioEntity;
	}

	public int getGifEntity() {
		return gifEntity;
	}

	public void setGifEntity(int gifEntity) {
		this.gifEntity = gifEntity;
	}
}
