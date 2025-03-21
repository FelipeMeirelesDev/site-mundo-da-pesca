package com.mundodapesca.mundodapesca.controller;

import com.mundodapesca.mundodapesca.model.Usuario;
import com.mundodapesca.mundodapesca.service.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario criarUsuarios(@RequestBody Usuario usuario) {
        return service.criarUsuario(usuario);
    }
}
