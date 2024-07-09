package com.poo.introducao;

import java.util.ArrayList;
import java.util.List;

    public class Avaliacao {
    protected String cpf;
    protected String categoria;
    protected int avaliacao;
    
    private static List<String[]> avaliacoes = new ArrayList<>();

    public static void registrarAvaliacao(String cpf, String categoria, int avaliacao) {
        avaliacoes.add(new String[]{cpf, categoria, String.valueOf(avaliacao)});
    }
}

