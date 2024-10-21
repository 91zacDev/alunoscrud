package com.escola.alunoscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.escola.alunoscrud.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Optional<Funcionario> findByEmail(String email); // Para login, por exemplo
}
