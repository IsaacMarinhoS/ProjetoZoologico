package com.poo.introducao;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Visitante> visitantes;
    private List<Funcionario> funcionarios;
    private List<Animal> animais;
    private List<Tarefa> tarefas;

    public Sistema() {
        this.visitantes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.animais = new ArrayList<>();
        this.tarefas = new ArrayList<>();
    }

    public Visitante adicionarVisitante(String nome, String cpf) {
        Visitante visitante = new Visitante(nome, cpf);
        visitantes.add(visitante);
        return visitante;
    }

    public Funcionario adicionarFuncionario(String nome, String cpf, String tipo) {
        Funcionario funcionario;
        if (tipo.equals("gestor")) {
            funcionario = new Gestor(nome, cpf);
        } else if (tipo.equals("cuidador")) {
            funcionario = new Cuidador(nome, cpf);
        } else {
            funcionario = new Funcionario(nome, cpf);
        }
        funcionarios.add(funcionario);
        return funcionario;
    }

    public Animal adicionarAnimal(String nome, String especie, Cuidador cuidador) {
        Animal animal = new Animal(nome, especie, cuidador);
        animais.add(animal);
        return animal;
    }

    public void lancarTarefa(String descricao, Cuidador cuidador) {
        Tarefa tarefa = new Tarefa(descricao, cuidador);
        tarefas.add(tarefa);
        cuidador.realizarTarefa(tarefa);
    }
}
