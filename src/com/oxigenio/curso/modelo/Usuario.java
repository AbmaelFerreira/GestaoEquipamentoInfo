package com.oxigenio.curso.modelo;

import javax.faces.bean.ViewScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@ViewScoped
@Entity
public class Usuario {
	
	@Id
	private int id;
	private String nome;
	private String login;
	private String senha;
	private int permissao;
	private int unidade;
	private int setor;
	
	
	
	
	public boolean isLogado()
	{
		return login != null;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String descricao) {
		this.nome = descricao;
	}
	public int getPermissao() {
		return permissao;
	}
	public void setPermissao(int nivel) {
		this.permissao = nivel;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public int getUnidade() {
		return unidade;
	}


	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}


	public int getSetor() {
		return setor;
	}


	public void setSetor(int setor) {
		this.setor = setor;
	}
	
		

}
