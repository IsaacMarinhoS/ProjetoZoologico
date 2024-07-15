package com.poo.introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Sistema {

    private double faturamentoTotal;

    private double precoInteira = 50.0;
    private double precoMeiaEntrada = 25.0;


    private Scanner scanner;

    private List<Funcionario> funcionarios;
    private List<Visitante> visitantes;
    private List<Avaliacao> avaliacoes;
    private List<Animal> animais;
    private Map<String, List<LocalDateTime>> entradasPorHorario;
    private Map<Animal, List<String>> cuidadosDiarios;
    private List<Tarefa> tarefasDiarias;

    public Sistema() {
        this.funcionarios = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
        this.animais = new ArrayList<>();
        this.entradasPorHorario = new HashMap<>();
        this.cuidadosDiarios = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.tarefasDiarias = new ArrayList<>();
        this.faturamentoTotal = 0.0;
    }

    public Funcionario adicionarFuncionario(String nome, String cpf, String tipo) {
        Funcionario funcionario = null;
        if ("cuidador".equalsIgnoreCase(tipo)) {
            funcionario = new Cuidador(nome, cpf);
        } else if ("gestor".equalsIgnoreCase(tipo)) {
            funcionario = new Gestor(nome, cpf);
        }
        if (funcionario != null) {
            funcionarios.add(funcionario);
        }
        return funcionario;
    }

    public Cuidador buscarCuidadorPorCPF(String cpf) {
        for (Funcionario f : funcionarios) {
            if (f instanceof Cuidador && f.getCpf().equals(cpf)) {
                return (Cuidador) f;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorCPF(String cpf) {
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equals(cpf)) {
                return f;
            }
        }
        return null;
    }

    public void adicionarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }

    public void comprarIngresso(String nomeVisitante, String cpfVisitante, boolean meiaEntrada) {
        double valorIngresso = calcularValorIngresso(meiaEntrada);
        faturamentoTotal += valorIngresso;
        System.out.println("Ingresso comprado para " + nomeVisitante + " com CPF " + cpfVisitante);
    }

    private double calcularValorIngresso(boolean meiaEntrada) {
        if (meiaEntrada) {
            return 25.0; 
        } else {
            return 50.0; 
        }
    }

    
    public void verFaturamentoParque() {
        System.out.println("O faturamento total do parque é: R$ " + faturamentoTotal);
    }

    public boolean verificarCompraIngresso(String cpf) {
        for (Visitante visitante : visitantes) {
            if (visitante.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void avaliarAtendimento(int avaliacao) {
        Avaliacao novaAvaliacao = new Avaliacao("teste","teste", avaliacao);
        avaliacoes.add(novaAvaliacao);
        System.out.println("Avaliação do atendimento registrada: " + avaliacao);
    }

    public void visualizarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println("Nome: " + funcionario.getNome() + ", CPF: " + funcionario.getCpf() + ", Tipo: "
                        + funcionario.getClass().getSimpleName());
            }
        }
    }

    public void alterarFuncionario(int id) {
        if (id >= 0 && id < funcionarios.size()) {
            Funcionario funcionario = funcionarios.get(id);
            System.out.println("Alterando funcionário: " + funcionario.getNome());
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o novo nome para " + funcionario.getNome() + ": ");
            String novoNome = scanner.nextLine();
            funcionario.setNome(novoNome);
            System.out.print("Digite o novo CPF para " + funcionario.getCpf() + ": ");
            String novoCpf = scanner.nextLine();
            funcionario.setCpf(novoCpf);
            System.out.print("Digite o novo TIPO (Cuidador,Gestor,Atendente) para " + funcionario.getTipo() + ": ");
            String novoTipo = scanner.nextLine();
            funcionario.setTipo(novoTipo);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public Funcionario incluirFuncionario(String nome, String cpf, String tipo) {
        Funcionario funcionario = null;
        if ("cuidador".equalsIgnoreCase(tipo)) {
            funcionario = new Cuidador(nome, cpf);
        } else if ("gestor".equalsIgnoreCase(tipo)) {
            funcionario = new Gestor(nome, cpf);
        } else if ("atendente".equalsIgnoreCase(tipo)) {
            funcionario = new Atendente(nome, cpf);
        }
        if (funcionario != null) {
            funcionarios.add(funcionario);
        } else {
            System.out.println("Tipo de funcionário inválido.");
        }
        return funcionario;
    }

    public void excluirFuncionario(int id) {
        if (id >= 0 && id < funcionarios.size()) {
            funcionarios.remove(id);
            System.out.println("Funcionário excluído com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void visualizarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Não há animais cadastrados no zoológico.");
        } else {
            System.out.println("Lista de Animais no Zoológico:");
            for (Animal animal : animais) {
                System.out.println(animal.getNome());
                System.out.println(animal.getEspecie());
            }
        }
    }

    public void adicionarAnimal(String nome, String especie) {
        Animal animal = new Animal(nome, especie);
        cuidadosDiarios.put(animal, new ArrayList<>());
        animais.add(animal);
    }

    public void alterarAnimal(int id) {
        if (id >= 0 && id < animais.size()) {
            Animal animal = animais.get(id);
            System.out.println("Alterando animal: " + animal.getNome());
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o novo nome para " + animal.getNome() + ": ");
            String novoNome = scanner.nextLine();
            animal.setNome(novoNome);
            System.out.print("Digite a nova espécie para " + animal.getEspecie() + ": ");
            String novoEspecie = scanner.nextLine();
            animal.setEspecie(novoEspecie);
        } else {
            System.out.println("Animal não encontrado.");
        }
    }

    public void excluirAnimal(int id) {
        if (id >= 0 && id < animais.size()) {
            animais.remove(id);
            System.out.println("Animal excluído com sucesso.");
        } else {
            System.out.println("Animal não encontrado.");
        }
    }

    public void lancarTarefaDiaria(String descricao, String cpfCuidador) {
        Cuidador cuidador = buscarCuidadorPorCPF(cpfCuidador);
        if (cuidador != null) {
            Tarefa tarefa = new Tarefa(descricao, cuidador);
            tarefasDiarias.add(tarefa);
            System.out.println("Tarefa diária lançada com sucesso!");
        } else {
            System.out.println("Cuidador não encontrado.");
        }
    }

    public void verificarTarefasExecutadas() {
        if (tarefasDiarias.isEmpty()) {
            System.out.println("Nenhuma tarefa executada.");

        } else {
            for (Tarefa tarefa : tarefasDiarias) {
                System.out
                        .println("Tarefa: " + tarefa.getDescricao() + ", Cuidador: " + tarefa.getCuidador().getNome());
            }
        }
        System.out.println("Verificando tarefas executadas.");

    }

    public void verAvaliacoesVisitantes() {
        System.out.println(Avaliacao.getAvaliacoes().get(0).getCpf());
        List<Avaliacao> avaliacoes = Avaliacao.getAvaliacoes();
        avaliacoes.get(0).getCpf();
        if (avaliacoes.isEmpty()) {
            System.out.println("Nenhuma avaliação registrada.");

        } else {
            for (Avaliacao avaliacao : avaliacoes) {
                System.out.println(
                        "CPF: " + avaliacao.getCpf() + ", Categoria: " + avaliacao.getCategoria() + ", Avaliação: " + avaliacao.getNota());
            }
        }
    }


   

    public void avaliarAtracoes(String atracaoFavorita, String atracaoMenosGostou) {
        System.out.println("Avaliação da atração favorita: " + atracaoFavorita);
        System.out.println("Avaliação da atração menos gostada: " + atracaoMenosGostou);
    }

}
