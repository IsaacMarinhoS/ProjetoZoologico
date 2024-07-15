package com.poo.introducao;

public class Visitante {
    private String nome;
    private String cpf;
    private boolean meiaEntrada;

    public Visitante(String nome, String cpf, boolean meiaEntrada) {
        this.nome = nome;
        this.cpf = cpf;
        this.meiaEntrada = meiaEntrada;
    }

    public boolean isMeiaEntrada() {
        return meiaEntrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}