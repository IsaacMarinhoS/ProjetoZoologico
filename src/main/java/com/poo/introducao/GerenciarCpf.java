
    package com.poo.introducao;

import java.util.Map;
import java.util.Scanner;

  public class GerenciarCpf {

    private static GerenciamentoIngressos gerenciamento = new GerenciamentoIngressos();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    venderIngresso(scanner);
                    break;
                case 2:
                    exibirHorariosDeMaiorMovimento();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===== Menu Principal =====");
        System.out.println("1 - Vender Ingresso");
        System.out.println("2 - Verificar Horários de Maior Movimento");
        System.out.println("0 - Sair do Sistema");
        System.out.print("Escolha uma opção: ");
    }

    private static void venderIngresso(Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o tipo do cliente (1 - NORMAL, 2 - ESTUDANTE, 3 - IDOSO): ");
        int tipoClienteInt = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner
        TipoCliente tipoCliente = TipoCliente.values()[tipoClienteInt - 1];

        System.out.print("Digite o tipo de ingresso (1 - INTEIRA, 2 - MEIA): ");
        int tipoIngressoInt = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner
        TipoIngresso tipoIngresso = TipoIngresso.values()[tipoIngressoInt - 1];

        Cliente cliente = new Cliente(nome, cpf, tipoCliente);
        gerenciamento.venderIngresso(cliente, tipoIngresso);
    }

    private static void exibirHorariosDeMaiorMovimento() {
        Map<Integer, Long> movimento = gerenciamento.horariosDeMaiorMovimento();
        System.out.println("Horários de maior movimento: " + movimento);
    }
}

