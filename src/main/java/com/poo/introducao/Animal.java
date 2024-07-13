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
    public Animal(String nome,String especie){
        this.nome = nome;
        this.especie = especie;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Cuidador getCuidador() {
        return cuidador;
    }
    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

   

}