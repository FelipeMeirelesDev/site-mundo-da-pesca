package com.mundodapesca.mundodapesca.repository;

import com.mundodapesca.mundodapesca.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
