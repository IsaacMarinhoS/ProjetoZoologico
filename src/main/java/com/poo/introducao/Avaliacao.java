package com.poo.introducao;

import java.util.ArrayList;
import java.util.List;

public class Avaliacao {
    protected String cpf;
    protected String categoria;
    protected int nota;

    private static List<Avaliacao> avaliacoes = new ArrayList<>();

    public Avaliacao(String cpf,String categoria, int nota ){
        this.cpf = cpf;
        this.categoria = categoria;
        this.nota = nota;
    }
    public Avaliacao(){
        
    }

    public static void registrarAvaliacao(String cpf, String categoria, int nota) {
        avaliacoes.add(new Avaliacao(cpf,categoria,nota));
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public static List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
}
