package com.poo.introducao;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Funcionario> funcionarios;
    private List<Visitante> visitantes;
    private List<Avaliacao> avaliacoes;

    public Sistema() {
        this.funcionarios = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Funcionario adicionarFuncionario(String nome, String cpf, String tipo) {
        Funcionario funcionario = null;
        if ("cuidador".equalsIgnoreCase(tipo)) {
            funcionario = new Cuidador(nome, cpf);
        } else if ("gestor".equalsIgnoreCase(tipo)) {
            funcionario = new Gestor(nome, cpf);
        }
        if (funcionario != null) {
            funcionarios.add(funcionario);
        }
        return funcionario;
    }

    public Cuidador buscarCuidadorPorCPF(String cpf) {
        for (Funcionario f : funcionarios) {
            if (f instanceof Cuidador && f.getCpf().equals(cpf)) {
                return (Cuidador) f;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorCPF(String cpf) {
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }
        return null;
    }

    public Animal adicionarAnimal(String nome, String especie, Cuidador cuidador) {
        Animal animal = new Animal(nome, especie, cuidador);
        animal.add(animal);
        return animal;
    }

    public void adicionarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }

    public void comprarIngresso(String nomeVisitante, String cpfVisitante, int tipoIngresso) {
      
        Visitante visitante = new Visitante(nomeVisitante, cpfVisitante);
        visitantes.add(visitante);
        System.out.println("Ingresso comprado para " + nomeVisitante + " com CPF " + cpfVisitante);
    }

    public boolean verificarCompraIngresso(String cpf) {
        for (Visitante visitante : visitantes) {
            if (visitante.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    
    public void avaliarAtendimento(int avaliacao) {
        Avaliacao novaAvaliacao = new Avaliacao( );
        System.out.println("Atendimento" + avaliacao);
        avaliacoes.add(novaAvaliacao);
        System.out.println("Avaliação do atendimento registrada: " + avaliacao);
    }

    
    public void avaliarAtracoes(String atracaoFavorita, String atracaoMenosGostou) {
        
        Avaliacao avaliacaoFavorita = new Avaliacao(); 
        System.out.println(atracaoFavorita + "5");
        Avaliacao avaliacaoMenosGostou = new Avaliacao(); 
        System.out.println(atracaoMenosGostou + "1");
        avaliacoes.add(avaliacaoFavorita);
        avaliacoes.add(avaliacaoMenosGostou);
        System.out.println("Avaliações das atrações registradas: " + atracaoFavorita + ", " + atracaoMenosGostou);
    }
}