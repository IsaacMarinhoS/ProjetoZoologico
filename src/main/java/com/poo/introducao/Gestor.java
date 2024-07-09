package com.poo.introducao;

import java.util.ArrayList;
import java.util.List;

public class Gestor extends Funcionario {
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static List<Animal> animais = new ArrayList<>();
    private static List<Tarefa> tarefas = new ArrayList<>();

    public Gestor(String nome, String cpf) {
        super(nome, cpf);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String cpf) {
        funcionarios.removeIf(f -> f.cpf.equals(cpf));
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void removerAnimal(String nome) {
        animais.removeIf(a -> a.getNome().equals(nome));
    }

    public void lancarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> verificarTarefasExecutadas() {
        List<Tarefa> tarefasExecutadas = new ArrayList<>();
        for (Tarefa t : tarefas) {
            if (t.isExecutada()) {
                tarefasExecutadas.add(t);
            }
        }
        return tarefasExecutadas;
    }

    public List<Tarefa> verificarTarefasAbertas() {
        List<Tarefa> tarefasAbertas = new ArrayList<>();
        for (Tarefa t : tarefas) {
            if (!t.isExecutada()) {
                tarefasAbertas.add(t);
            }
        }
        return tarefasAbertas;
    }
}
