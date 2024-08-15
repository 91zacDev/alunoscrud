package com.escola.alunoscrud.repository;

import com.escola.alunoscrud.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
