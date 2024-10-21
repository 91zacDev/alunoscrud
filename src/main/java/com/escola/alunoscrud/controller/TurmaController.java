package com.escola.alunoscrud.controller;

import com.escola.alunoscrud.model.Turma;
import com.escola.alunoscrud.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private final TurmaService turmaService;

    @Autowired
    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @GetMapping
    public ResponseEntity<List<Turma>> listarTurmas() {
        return ResponseEntity.ok(turmaService.listarTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> buscarTurmaPorId(@PathVariable Long id) {
        Optional<Turma> turma = turmaService.buscarPorId(id);
        return turma.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Turma> criarTurma(@RequestBody Turma turma) {
        return ResponseEntity.status(201).body(turmaService.salvar(turma));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Turma> atualizarTurma(@PathVariable Long id, @RequestBody Turma turma) {
        if (turmaService.buscarPorId(id).isPresent()) {
            turma.setId(id);
            return ResponseEntity.ok(turmaService.salvar(turma));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTurma(@PathVariable Long id) {
        if (turmaService.buscarPorId(id).isPresent()) {
            turmaService.deletar(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
