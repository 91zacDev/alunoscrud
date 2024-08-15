package com.escola.alunoscrud;

import com.escola.alunoscrud.model.Aluno;
import com.escola.alunoscrud.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public void run(String... args) throws Exception {

        alunoRepository.save(new Aluno("João Silva", 15, 75, 80, "Maria Oliveira", 101));
        alunoRepository.save(new Aluno("Ana Souza", 14, 88, 90, "Carlos Martins", 102));
        alunoRepository.save(new Aluno("Pedro Lima", 16, 62, 70, "Fernanda Alves", 103));
        alunoRepository.save(new Aluno("Mariana Santos", 15, 92, 95, "João Pereira", 101));
        alunoRepository.save(new Aluno("Lucas Almeida", 13, 78, 85, "Maria Oliveira", 104));
        alunoRepository.save(new Aluno("Isabela Ferreira", 16, 70, 75, "Carlos Martins", 102));
        alunoRepository.save(new Aluno("Felipe Costa", 14, 83, 87, "Fernanda Alves", 105));
        alunoRepository.save(new Aluno("Carolina Mendes", 15, 90, 93, "João Pereira", 103));
        alunoRepository.save(new Aluno("Gabriel Rocha", 17, 66, 72, "Maria Oliveira", 106));
        alunoRepository.save(new Aluno("Beatriz Gonçalves", 13, 85, 88, "Carlos Martins", 104));
        alunoRepository.save(new Aluno("Renato Vieira", 16, 79, 83, "Fernanda Alves", 105));
        alunoRepository.save(new Aluno("Camila Nunes", 14, 91, 94, "João Pereira", 101));
        alunoRepository.save(new Aluno("Thiago Barbosa", 17, 68, 71, "Maria Oliveira", 106));
        alunoRepository.save(new Aluno("Larissa Azevedo", 15, 87, 89, "Carlos Martins", 102));
        alunoRepository.save(new Aluno("Rafael Ribeiro", 16, 73, 77, "Fernanda Alves", 103));
        alunoRepository.save(new Aluno("Juliana Cardoso", 14, 92, 96, "João Pereira", 101));
        alunoRepository.save(new Aluno("Gustavo Fernandes", 13, 80, 84, "Maria Oliveira", 104));
        alunoRepository.save(new Aluno("Bruna Rocha", 15, 88, 91, "Carlos Martins", 102));
        alunoRepository.save(new Aluno("André Oliveira", 16, 74, 79, "Fernanda Alves", 103));
        alunoRepository.save(new Aluno("Luana Mendes", 14, 89, 92, "João Pereira", 105));
        alunoRepository.save(new Aluno("Rodrigo Souza", 17, 65, 69, "Maria Oliveira", 106));
        alunoRepository.save(new Aluno("Paula Silva", 15, 83, 86, "Carlos Martins", 104));
        alunoRepository.save(new Aluno("Vinícius Costa", 14, 77, 81, "Fernanda Alves", 102));
        alunoRepository.save(new Aluno("Daniela Gomes", 13, 90, 93, "João Pereira", 101));
        alunoRepository.save(new Aluno("Ricardo Santana", 16, 72, 76, "Maria Oliveira", 103));
    }
}
