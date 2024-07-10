package com.poo.introducao;

import java.time.LocalDate;
//

public class Tarefa {
    private String descricao;
    private Cuidador cuidador;

    public Tarefa(String descricao, Cuidador cuidador) {
        this.descricao = descricao;
        this.cuidador = cuidador;
    }

    public String getDescricao() {
        return descricao;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }
}
