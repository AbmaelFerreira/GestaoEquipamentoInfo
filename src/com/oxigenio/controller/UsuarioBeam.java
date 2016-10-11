package com.oxigenio.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.oxigenio.curso.modelo.Usuario;

@ViewScoped
@ManagedBean
public class UsuarioBeam {
	
	
	private Usuario usuario;
	
	private String nomeUsuario;
	private String senha;
	
	public String Acessologin()
	{
	
	
	
			if("admin".equals(this.nomeUsuario) && "123".equals(this.senha))
			{
				
				return "/index";
				
			}else
			{
				
			}
			return null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
