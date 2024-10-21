package com.escola.alunoscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.escola.alunoscrud.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByTurmaId(Long turmaId); // Exemplo de consulta customizada
}
