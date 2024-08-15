package com.escola.alunoscrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private int notaDoPrimeiroSemestre;
    private int notaDoSegundoSemestre;
    private String nomeDoProfessor;
    private int numeroDaSala;

    public Aluno(String nome, int idade, int notaDoPrimeiroSemestre, int notaDoSegundoSemestre, String nomeDoProfessor, int numeroDaSala) {
        this.nome = nome;
        this.idade = idade;
        this.notaDoPrimeiroSemestre = notaDoPrimeiroSemestre;
        this.notaDoSegundoSemestre = notaDoSegundoSemestre;
        this.nomeDoProfessor = nomeDoProfessor;
        this.numeroDaSala = numeroDaSala;
    }

}

