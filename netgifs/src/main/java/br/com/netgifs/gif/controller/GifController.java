package br.com.netgifs.gif.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.netgifs.categoria.controller.CadastrarCatagoriaController;
import br.com.netgifs.model.GifModel;
import br.com.netgifs.repository.GifRepository;
import br.com.netgifs.utils.Util;

@Named(value="gifControlle")
@RequestScoped
public class GifController {
	
	@Inject
	GifModel gifModel;
	
	@Inject
	GifRepository gifRepository;
	
	@Inject
	CadastrarCatagoriaController cadastrarCatagoriaController;

	public GifModel getGifModel() {
		return gifModel;
	}

	public void setGifModel(GifModel gifModel) {
		this.gifModel = gifModel;
	}
	
	public void salvarGif(){
		gifRepository.salvarGif(this.gifModel);
		
		this.gifModel=null;
		
		Util.MensagemInfo("Registro cadastrado com sucesso");
		
	}
}
