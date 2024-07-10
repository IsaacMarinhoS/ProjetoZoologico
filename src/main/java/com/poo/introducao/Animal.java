package com.poo.introducao;

public class Animal {
    private String nome;
    private String especie;
    private Cuidador cuidador;

    public Animal(String nome, String especie, Cuidador cuidador) {
        this.nome = nome;
        this.especie = especie;
        this.cuidador = cuidador;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }
}