package com.poo.introducao;

import java.util.ArrayList;
import java.util.List;

public class Cuidador extends Funcionario {
    private List<Tarefa> tarefas;

    public Cuidador(String nome, String cpf) {
        super(nome, cpf);
        this.tarefas = new ArrayList<>();
    }

    public void realizarTarefa(Tarefa tarefa) {
        tarefa.setExecutada(true);
        tarefas.add(tarefa);
    }
}
    
    

