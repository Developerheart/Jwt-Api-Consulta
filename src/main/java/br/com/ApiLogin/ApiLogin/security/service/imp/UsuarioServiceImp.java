package br.com.ApiLogin.ApiLogin.security.service.imp;

import br.com.ApiLogin.ApiLogin.security.entities.Usuario;
import br.com.ApiLogin.ApiLogin.security.repository.UsuarioRepository;
import br.com.ApiLogin.ApiLogin.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> findByEmail(String email) {

        return usuarioRepository.findByEmail(email);
    }

    @Override
    public Usuario save(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }
}