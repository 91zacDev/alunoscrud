package com.escola.alunoscrud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Entity
@Data
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    @Size(min = 3, message = "Nome deve ter no mínimo 3 caracteres.")
    private String nome;

    @NotBlank(message = "Instrutor é obrigatório.")
    private String instrutor;

    @OneToMany(mappedBy = "turma")
    private List<Aluno> alunos;
}