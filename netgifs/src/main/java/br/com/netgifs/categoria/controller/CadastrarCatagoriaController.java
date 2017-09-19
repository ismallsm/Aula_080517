package br.com.netgifs.categoria.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.netgifs.model.CategoriaModel;
import br.com.netgifs.repository.CategoriaRepository;
import br.com.netgifs.utils.Util;

@Named(value="cadastrarCatagoriaController")
@RequestScoped
public class CadastrarCatagoriaController {
	
	@Inject
	CategoriaModel categoriaModel;
	
	@Inject
	CategoriaRepository categoriaRepository;

	public CategoriaModel getCategoriaModel() {
		return categoriaModel;
	}

	public void setCategoriaModel(CategoriaModel categoriaModel) {
		this.categoriaModel = categoriaModel;
	}
	
	public void salvarCategoria(){
		categoriaRepository.salvarCategoria(this.categoriaModel);
		this.categoriaModel = null;
		Util.MensagemInfo("Registro cadastrado com sucesso");
		
	}
}
