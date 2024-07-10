package com.poo.introducao;
import java.util.ArrayList;
import java.util.List;

public class Visitante {
    private String nome;
    private String cpf;
    private List<String> ingressos;
    private int avaliacaoAtendimento;
    private List<AvaliacaoAtracao> avaliacoesAtracoes;

    public Visitante(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.ingressos = new ArrayList<>();
        this.avaliacoesAtracoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void comprarIngresso(String tipo) {
        if (tipo.equalsIgnoreCase("inteira") || tipo.equalsIgnoreCase("meia")) {
            ingressos.add(tipo);
            System.out.println("Ingresso " + tipo + " comprado com sucesso.");
        } else {
            System.out.println("Tipo de ingresso inválido.");
        }
    }

    public void avaliarAtendimento(int nota) {
        if (nota >= 1 && nota <= 5) {
            this.avaliacaoAtendimento = nota;
            System.out.println("Avaliação do atendimento registrada com nota: " + nota);
        } else {
            System.out.println("Nota de avaliação inválida. Deve ser entre 1 e 5.");
        }
    }

    public void avaliarAtracao(String nomeAtracao, int nota) {
        if (nota >= 1 && nota <= 5) {
            AvaliacaoAtracao avaliacao = new AvaliacaoAtracao(nomeAtracao, nota);
            avaliacoesAtracoes.add(avaliacao);
            System.out.println("Avaliação da atração " + nomeAtracao + " registrada com nota: " + nota);
        } else {
            System.out.println("Nota de avaliação inválida. Deve ser entre 1 e 5.");
        }
    }

    private class AvaliacaoAtracao {
        private String nomeAtracao;
        private int nota;

        public AvaliacaoAtracao(String nomeAtracao, int nota) {
            this.nomeAtracao = nomeAtracao;
            this.nota = nota;
        }

        public String getNomeAtracao() {
            return nomeAtracao;
        }

        public int getNota() {
            return nota;
        }
    }
}