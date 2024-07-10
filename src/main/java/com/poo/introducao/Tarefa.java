package com.poo.introducao;

import java.time.LocalDate;
//

public class Tarefa {
    private String descricao;
    private Cuidador cuidador;
    private boolean executada;

    public Tarefa(String descricao, Cuidador cuidador) {
        this.descricao = descricao;
        this.cuidador = cuidador;
        this.executada = false;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public boolean isExecutada() {
        return executada;
    }

    public void setExecutada(boolean executada) {
        this.executada = executada;
    }
}
