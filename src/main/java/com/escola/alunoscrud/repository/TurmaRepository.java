package com.escola.alunoscrud.repository;

import com.escola.alunoscrud.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
}