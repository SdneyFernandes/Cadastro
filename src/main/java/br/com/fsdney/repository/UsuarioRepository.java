package br.com.fsdney.repository;


import br.com.fsdney.model.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class UsuarioRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Usuario usuario) {
        em.persist(usuario);
    }

    // Outros métodos, como buscar, atualizar, deletar
}
