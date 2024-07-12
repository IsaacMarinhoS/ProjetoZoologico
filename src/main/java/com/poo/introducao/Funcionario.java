package com.poo.introducao;


public class Funcionario {

    protected String nome;
    protected String cpf;
    protected String tipo;

    public Funcionario(String nome, String cpf , String tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
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