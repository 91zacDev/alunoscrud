package com.escola.alunoscrud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
public class Funcionario {

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

    @NotBlank(message = "Senha é obrigatória.")
    @Size(min = 6, message = "Senha deve ter no mínimo 6 caracteres.")
    private String senha;

    @NotBlank(message = "Cargo é obrigatório.")
    private String cargo;
}
