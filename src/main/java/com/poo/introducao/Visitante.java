package com.poo.introducao;
import java.util.ArrayList;
import java.util.List;

public class Visitante {
    private String nome;
    private String cpf;
    private List<Ingresso> ingressos;

    public Visitante(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.ingressos = new ArrayList<>();
    }

    public void comprarIngresso(String tipo) {
        if (!podeComprarIngresso()) {
            System.out.println("CPF " + cpf + " já comprou ingresso.");
            return;
        }
        Ingresso ingresso = new Ingresso(tipo, this);
        ingressos.add(ingresso);
        System.out.println("Ingresso " + tipo + " comprado com sucesso.");
    }

    public boolean podeComprarIngresso() {
        return ingressos.isEmpty();
    }

    public void avaliarAtendimento(int avaliacao) {
        Avaliacao.registrarAvaliacao(cpf, "atendimento", avaliacao);
    }

    public void avaliarAtracao(String atracao, int avaliacao) {
        Avaliacao.registrarAvaliacao(cpf, atracao, avaliacao);
    }
}