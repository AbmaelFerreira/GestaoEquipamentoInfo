package com.oxigenio.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.oxigenio.curso.modelo.Usuario;

@SessionScoped
@ManagedBean
public class UsuarioBeam {
		
	private Usuario usuario;
	private String nomeUsuario;
	private String senha;
	
	
	public UsuarioBeam()
	{
		usuario = new Usuario();
		
	}
	
	//METODO  PARA ACESSAR O SISTEMA
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
	
	
	
	//METODO PARA CADASTRAR
	
	public String Cadastrar()
	{
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		this.usuario.setId(usuario.getId());
		this.usuario.setNome(usuario.getNome());
		this.usuario.setLogin(usuario.getLogin());
		this.usuario.setSenha(usuario.getLogin());
		this.usuario.setPermissao(usuario.getPermissao());
		this.usuario.setPermissao(usuario.getPermissao());
		this.usuario.setSetor(usuario.getSetor());
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		System.out.println("Usuário salvo com sucesso!");
		return "/UsuarioSis";

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//-----------------gets e sets----------------------------------

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
