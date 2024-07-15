package com.poo.introducao;

public class AvaliacaoAtracao {
    private String atracaoFavorita;
    private String atracaoMenosGostada;

    public AvaliacaoAtracao(String atracaoFavorita, String atracaoMenosGostada) {
        this.atracaoFavorita = atracaoFavorita;
        this.atracaoMenosGostada = atracaoMenosGostada;
    }


    @Override
    public String toString() {
        return "Atração Favorita: " + atracaoFavorita + ", Atração Menos Gostada: " + atracaoMenosGostada;
    }
}