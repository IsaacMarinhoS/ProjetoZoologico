package com.poo.introducao;

import java.util.Scanner;

public class Menu {

    private Sistema sistema;
    private Scanner scanner;

    public Menu(Sistema sistema) {
        this.sistema = sistema;
        this.scanner = new Scanner(System.in);
    }
    
    private void adicionarAnimal() {
        System.out.println("Opção 1. Adicionar Animal selecionada.");

       
        System.out.print("Digite o nome do animal: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a espécie do animal: ");
        String especie = scanner.nextLine();

     
        System.out.print("\nDeseja cadastrar um novo cuidador? (S/N): ");
        String cadastrarCuidador = scanner.nextLine();
        if (cadastrarCuidador.equalsIgnoreCase("S")) {
            cadastrarNovoCuidador();
        }

        
        System.out.print("\nDigite o CPF do cuidador: ");
        String cpfCuidador = scanner.nextLine();

      
        Cuidador cuidador = sistema.buscarCuidadorPorCPF(cpfCuidador);
        
        if (cuidador == null) {
            Funcionario funcionario = sistema.buscarFuncionarioPorCPF(cpfCuidador);
            if (funcionario instanceof Cuidador) {
                cuidador = (Cuidador) funcionario;
            }
        }

        if (cuidador != null) {
            sistema.adicionarAnimal(nome, especie, cuidador);
            System.out.println("Animal adicionado com sucesso.");
        } else {
            System.out.println("Cuidador não encontrado.");
        }
    }

    private void lancarTarefa() {
        System.out.print("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();
        System.out.print("Digite o CPF do cuidador: ");
        String cpfCuidador = scanner.nextLine();
        Cuidador cuidador = sistema.buscarCuidadorPorCPF(cpfCuidador);
        if (cuidador != null) {
            Tarefa tarefa = new Tarefa(descricao, cuidador);
            Gestor gestor = (Gestor) sistema.buscarFuncionarioPorCPF(cuidador.getCpf());
            if (gestor != null) {
                gestor.lancarTarefa(tarefa);
                System.out.println("Tarefa lançada com sucesso.");
            } else {
                System.out.println("Gestor não encontrado.");
            }
        } else {
            System.out.println("Cuidador não encontrado.");
        }
    }

    private void cadastrarNovoCuidador() {
        System.out.println("\nCadastro de Novo Cuidador:");
        System.out.print("Digite o nome do cuidador: ");
        String nomeCuidador = scanner.nextLine();
        System.out.print("Digite o CPF do cuidador: ");
        String cpfCuidador = scanner.nextLine();

        sistema.adicionarFuncionario(nomeCuidador, cpfCuidador, "Cuidador");
        
        System.out.println("Novo cuidador cadastrado com sucesso.");
    }

    public void menuInterativo() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Animal");
            System.out.println("2. Lançar Tarefa");
            System.out.println("3. Cadastrar Novo Cuidador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    adicionarAnimal();
                    break;
                case 2:
                    lancarTarefa();
                    break;
                case 3:
                    cadastrarNovoCuidador();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}


    