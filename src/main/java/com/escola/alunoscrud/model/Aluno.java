package com.escola.alunoscrud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    @Size(min = 3, message = "Nome deve ter no mínimo 3 caracteres.")
    private String nome;

    @NotBlank(message = "Email é obrigatório.")
    @Email(message = "Email deve ser válido.")
    @Column(unique = true)
    private String email;

    @Positive(message = "Idade deve ser um valor positivo.")
    private int idade;

    @DecimalMax(value = "10.0", message = "Nota máxima é 10.0.")
    private Double notaPrimeiroModulo;

    @DecimalMax(value = "10.0", message = "Nota máxima é 10.0.")
    private Double notaSegundoModulo;

    private Double media;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @PrePersist
    @PreUpdate
    private void calcularMedia() {
        if (notaPrimeiroModulo != null && notaSegundoModulo != null) {
            this.media = (notaPrimeiroModulo + notaSegundoModulo) / 2;
        }
    }
}