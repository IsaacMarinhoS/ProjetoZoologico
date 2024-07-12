package com.poo.introducao;

import java.util.Scanner;
import java.util.Map;




public class MenuVisitante {
    private static GerenciamentoIngressos gerenciamento = new GerenciamentoIngressos();

    public static void menuInicial(){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    venderIngresso(scanner);
                    break;
                case 2:
                    exibirHorariosDeMaiorMovimento();
                    break;
                case 3:
                    avaliarAtendimento();
                    break;
                case 4:
                    avaliarAtracao();
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
        System.out.println("3.  Avaliar Atendimento");
        System.out.println("4.  Avaliar Atração Favorita");
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
        scanner.nextLine();
        TipoCliente tipoCliente = TipoCliente.values()[tipoClienteInt - 1];

        System.out.print("Digite o tipo de ingresso (1 - INTEIRA, 2 - MEIA): ");
        int tipoIngressoInt = scanner.nextInt();
        scanner.nextLine();
        TipoIngresso tipoIngresso = TipoIngresso.values()[tipoIngressoInt - 1];

        Cliente cliente = new Cliente(nome, cpf, tipoCliente);
        gerenciamento.venderIngresso(cliente, tipoIngresso);
        
    }

    private static void exibirHorariosDeMaiorMovimento() {
        Map<Integer, Long> movimento = gerenciamento.horariosDeMaiorMovimento();
        System.out.println("Horários de maior movimento: " + movimento);
    }

    protected static void avaliarAtendimento() {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();

        
        System.out.println("\nOpção 2. Avaliar Atendimento selecionada.");
        
        System.out.print("Digite sua avaliação do atendimento (de 1 a 5): ");
        int avaliacaoAtendimento = scanner.nextInt();
        scanner.nextLine(); 
        sistema.avaliarAtendimento(avaliacaoAtendimento);
        System.out.println("Avaliação do atendimento registrada com sucesso.");
        scanner.close();
    }

    protected static void avaliarAtracao() {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();



        System.out.println("\nOpção 3. Avaliar Atração Favorita selecionada.");
        
       
        System.out.print("Digite o nome da atração que você mais gostou: ");
        String atracaoFavorita = scanner.nextLine();
        System.out.print("Digite o nome da atração que você menos gostou: ");
        String atracaoMenosGostou = scanner.nextLine();
        
        sistema.avaliarAtracoes(atracaoFavorita, atracaoMenosGostou);
        System.out.println("Avaliações das atrações registradas com sucesso.");
        scanner.close();
    }
}