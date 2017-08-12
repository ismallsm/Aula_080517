package br.com.fiap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginMBean {
	private String boasvindas = "Olá, bem-vindo!";
	private String login;
	private String password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBoasvindas() {
		return boasvindas;
	}

	public void setBoasvindas(String boasvindas) {
		this.boasvindas = boasvindas;
	}
}
