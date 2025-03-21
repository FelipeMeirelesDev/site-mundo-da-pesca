package com.mundodapesca.mundodapesca.service;

import com.mundodapesca.mundodapesca.model.Usuario;
import com.mundodapesca.mundodapesca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }
}
