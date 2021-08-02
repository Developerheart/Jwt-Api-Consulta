package br.com.ApiLogin.ApiLogin.security.service;

import br.com.ApiLogin.ApiLogin.security.entities.Usuario;
import java.util.Optional;


public interface UsuarioService {

    Optional<Usuario> findByEmail(String email);

    Usuario save(Usuario usuario);
}