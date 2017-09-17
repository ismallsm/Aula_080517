package br.com.netgifs.usuario.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.netgifs.model.UsuarioModel;
import br.com.netgifs.repository.GifRepository;
import br.com.netgifs.repository.UsuarioRepository;
import br.com.netgifs.repository.entity.GifEntity;
import br.com.netgifs.repository.entity.UsuarioEntity;

@Named(value="gifController")
@SessionScoped
public class GifController implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@Inject
	private UsuarioModel usuarioModel;
 
	@Inject
	private UsuarioRepository usuarioRepository;
 
	@Inject
	private UsuarioEntity usuarioEntity;
 
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
}
