package com.poo.introducao;

import java.util.ArrayList;
import java.util.List;

public class Gestor extends Funcionario {

    public Gestor(String nome, String cpf ) {
        super(nome, cpf, "gestor");
    }

    public void lancarTarefa(Tarefa tarefa) {
        System.out.println("Tarefa lançada: " + tarefa.getDescricao());
    }

    public List<Tarefa> verificarTarefasExecutadas() {
        return new ArrayList<>();
    }

    public List<Tarefa> verificarTarefasAbertas() {
        return new ArrayList<>();
    }

    public void verAvaliacoes(List<Avaliacao> avaliacoes) {

    }
}