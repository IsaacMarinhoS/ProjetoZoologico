package com.poo.introducao;

public class Cliente {
    private String nome;
    private String cpf;
    private TipoCliente tipo;

    public Cliente(String nome, String cpf, TipoCliente tipo) {
        if (!validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
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

    private boolean validarCPF(String cpf) {
        // Adicione aqui a lógica de validação de CPF
        return true; // Placeholder para validação de CPF
    }
}

enum TipoCliente {
    DEFICIENTE, IDOSO, ESTUDANTE, NORMAL
}