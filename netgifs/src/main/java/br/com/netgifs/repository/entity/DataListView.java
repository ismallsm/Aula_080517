package br.com.netgifs.repository.entity;
 
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.netgifs.usuario.controller.GifController;
 
@ManagedBean
@ViewScoped
public class DataListView implements Serializable {
     
    private List<GifEntity> gifs;
    
    private List<CategoriaEntity> categorias;
         
    private GifEntity gifSelecionado;
    
    private CategoriaEntity categoriaSelecionada;
     
    @ManagedProperty("#{gifController}")
    private GifController service;
     
    @PostConstruct
    public void init() {
    	gifs = service.getGifs();
    	categorias = service.getCategorias();
    }

	public List<GifEntity> getGifs() {
		return gifs;
	}

	public void setGifs(List<GifEntity> gifs) {
		this.gifs = gifs;
	}

	public GifEntity getGifSelecionado() {
		return gifSelecionado;
	}

	public void setGifSelecionado(GifEntity gifSelecionado) {
		this.gifSelecionado = gifSelecionado;
	}

	public GifController getService() {
		return service;
	}

	public void setService(GifController service) {
		this.service = service;
	}

	public List<CategoriaEntity> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<CategoriaEntity> categorias) {
		this.categorias = categorias;
	}

	public CategoriaEntity getCategoriaSelecionada() {
		return categoriaSelecionada;
	}

	public void setCategoriaSelecionada(CategoriaEntity categoriaSelecionada) {
		this.categoriaSelecionada = categoriaSelecionada;
	}
}