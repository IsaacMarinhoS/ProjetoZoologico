package com.poo.introducao;
import java.util.Date;

public class Ingresso {
    private String tipo;
    private Visitante visitante;
    private Date data;

    public Ingresso(String tipo, Visitante visitante) {
        this.tipo = tipo;
        this.visitante = visitante;
        this.data = new Date();
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
    




