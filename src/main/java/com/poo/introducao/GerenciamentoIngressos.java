package com.poo.introducao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciamentoIngressos {
    private List<Ingresso> ingressos;
    private Map<String, LocalDateTime> vendasPorCpf;

    public GerenciamentoIngressos() {
        this.ingressos = new ArrayList<>();
        this.vendasPorCpf = new HashMap<>();
    }

    public void venderIngresso(Cliente cliente, TipoIngresso tipo) {
        if (vendasPorCpf.containsKey(cliente.getCpf())) {
            System.out.println("Venda negada: CPF já registrado para compra.");
            return;
        }

        if (tipo == TipoIngresso.MEIA && cliente.getTipo() == TipoCliente.NORMAL) {
            System.out.println("Venda negada: Meia entrada não disponível para este tipo de cliente.");
            return;
        }

        Ingresso ingresso = new Ingresso(cliente, tipo);
        ingressos.add(ingresso);
        vendasPorCpf.put(cliente.getCpf(), ingresso.getHorario());
        System.out.println("Venda realizada com sucesso.");
    }

    public Map<Integer, Long> horariosDeMaiorMovimento() {
        Map<Integer, Long> contagemPorHora = new HashMap<>();

        for (Ingresso ingresso : ingressos) {
            int hora = ingresso.getHorario().getHour();
            contagemPorHora.put(hora, contagemPorHora.getOrDefault(hora, 0L) + 1);
        }

        return contagemPorHora;
    }
}