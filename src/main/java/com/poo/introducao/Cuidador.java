package com.poo.introducao;

public class Cuidador extends Funcionario {
    public Cuidador(String nome, String cpf, String tipo) {
        super(nome, cpf, tipo);
    }

    public void realizarTarefa(Tarefa tarefa) {
        System.out.println("Tarefa realizada: " + tarefa.getDescricao());
    }
}
