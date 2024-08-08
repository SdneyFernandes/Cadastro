package br.com.fsdney.service;


import br.com.fsdney.model.Usuario;
import br.com.fsdney.repository.UsuarioRepository;

public class UsuarioService {
    private UsuarioRepository usuarioRepository = new UsuarioRepository();

    public void cadastrarUsuario(Usuario usuario) {
        
        usuarioRepository.salvar(usuario);
    }
}
