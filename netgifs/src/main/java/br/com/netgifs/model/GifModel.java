package br.com.netgifs.model;

public class GifModel {
	
	private String nomeGif;
	private String descricao;
	private Integer genero;
	private String nomeGenero;
	private String idioma;
	private String classificacao;
	private String url;
	
	public String getNomeGif() {
		return nomeGif;
	}
	public void setNomeGif(String nomeGif) {
		this.nomeGif = nomeGif;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getGenero() {
		return genero;
	}
	public void setGenero(Integer genero) {
		this.genero = genero;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getNomeGenero() {
		return nomeGenero;
	}
	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
