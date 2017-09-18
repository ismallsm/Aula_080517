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
         
    private GifEntity gifSelecionado;
     
    @ManagedProperty("#{gifController}")
    private GifController service;
     
    @PostConstruct
    public void init() {
    	gifs = service.getGifs();
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
}