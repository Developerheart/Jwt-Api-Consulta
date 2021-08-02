package br.com.ApiLogin.ApiLogin.security.repository;

import br.com.ApiLogin.ApiLogin.security.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}