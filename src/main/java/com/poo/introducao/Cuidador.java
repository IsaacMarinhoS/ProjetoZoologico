package com.poo.introducao;

public class Cuidador extends Funcionario {
    public Cuidador(String nome, String cpf) {
        super(nome, cpf, "cuidador");
    }

    public void realizarTarefa(Tarefa tarefa) {
        System.out.println("Tarefa realizada: " + tarefa.getDescricao());
    }
}
