package com.poo.introducao;

public class Cliente {
    private String nome;
    private String cpf;
    private TipoCliente tipo;

    public Cliente(String nome, String cpf, TipoCliente tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public TipoCliente getTipo() {
        return tipo;
    }
}

enum TipoCliente {
    IDOSO, ESTUDANTE, NORMAL
}