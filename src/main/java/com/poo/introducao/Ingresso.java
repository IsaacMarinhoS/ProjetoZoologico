package com.poo.introducao;
import java.time.LocalDateTime;

public class Ingresso {
    private Cliente cliente;
    private TipoIngresso tipo;
    private LocalDateTime horario;

    public Ingresso(Cliente cliente, TipoIngresso tipo) {
        this.cliente = cliente;
        this.tipo = tipo;
        this.horario = LocalDateTime.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoIngresso getTipo() {
        return tipo;
    }

    public LocalDateTime getHorario() {
        return horario;
    }
}

enum TipoIngresso {
    INTEIRA, MEIA
}



