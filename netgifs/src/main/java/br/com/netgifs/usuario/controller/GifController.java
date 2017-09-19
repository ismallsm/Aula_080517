package br.com.netgifs.usuario.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.netgifs.model.FavoritoModel;
import br.com.netgifs.model.UsuarioModel;
import br.com.netgifs.repository.CategoriaRepository;
import br.com.netgifs.repository.GifRepository;
import br.com.netgifs.repository.entity.CategoriaEntity;
import br.com.netgifs.repository.entity.GifEntity;


@Named(value="gifController")
@SessionScoped
public class GifController implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@Inject
	private UsuarioModel usuarioModel;
 
 
	public UsuarioModel getUsuarioModel() {
		return usuarioModel;
	}
	public void setUsuarioModel(UsuarioModel usuarioModel) {
		this.usuarioModel = usuarioModel;
	}
 
	public List<GifEntity> getGifs() {
        List<GifEntity> list = new ArrayList<GifEntity>();
        
        GifRepository gifRepository = new GifRepository();
        return gifRepository.buscarGifs();

    }
	
	public List<CategoriaEntity> getCategorias() {
        List<CategoriaEntity> list = new ArrayList<CategoriaEntity>();
        
        CategoriaRepository categoriaRepository = new CategoriaRepository();
        return categoriaRepository.buscarCategorias();

    }
	
	public List<GifEntity> getGifsByCategoria(){
        
        GifRepository gifRepository = new GifRepository();
        return  gifRepository.buscarGifsByCategoria(1);
	}
	
	public void favoritar(ActionEvent actionEvent) {
		
		GifRepository gifRepository = new GifRepository();
		FavoritoModel favoritoModel = new FavoritoModel();
		favoritoModel.setIdGif(1);
		favoritoModel.setIdUsuario(1);
		
		gifRepository.salvarFavorito(favoritoModel);
        System.out.println("entrou");
    }
	
	
}
