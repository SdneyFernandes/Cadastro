package br.com.fsdney.controller;

import br.com.fsdney.model.Usuario;
import br.com.fsdney.service.UsuarioService;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioController {
	private Usuario usuario = new Usuario();
	private UsuarioService usuarioService = new UsuarioService();
	
	public String cadastrar() {
		usuarioService.cadastrarUsuario(usuario);
		return "sucesso";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	
}
