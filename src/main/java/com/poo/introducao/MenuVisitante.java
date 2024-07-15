package com.poo.introducao;

import java.util.Scanner;
import java.util.Map;

public class MenuVisitante {

    public static void limpaConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static GerenciamentoIngressos gerenciamento = new GerenciamentoIngressos();

    public static void menuInicial() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            limpaConsole();

            switch (opcao) {
                case 1:
                    venderIngresso(scanner);
                    limpaConsole();
                    break;
                case 2:
                    exibirHorariosDeMaiorMovimento();
                    break;
                case 3:
                    avaliarAtendimento();
                    break;
                case 4:
                    avaliarAtracao();
                    limpaConsole();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    limpaConsole();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    limpaConsole();
            }
        } while (opcao != 0);

        scanner.close();
    }

    

    private static void exibirMenu() {
        System.out.println("            ___________________________________________");
        System.out.println("           |============== MENU VISITANTE =============|");
        System.out.println("           |1 - Comprar Ingresso                       |");
        System.out.println("           |2 - Verificar Horários de Maior Movimento  |");
        System.out.println("           |3.  Avaliar Atendimento                    |");
        System.out.println("           |4.  Avaliar Atração Favorita               |");
        System.out.println("           |0 - Sair do Sistema                        |");
        System.out.println("           |___________________________________________|");
        System.out.print("           Escolha uma opção: ");
    }

    private static void venderIngresso(Scanner scanner) {

        Sistema sistema = new Sistema();

        System.out.print("\n\n          Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("          Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        System.out.print("          Digite o tipo de ingresso  (1 - INTEIRA, 2 - MEIA): ");
        int tipoIngressoInt = scanner.nextInt();
        scanner.nextLine();
        boolean meiaEntrada = (tipoIngressoInt == 2);

        sistema.comprarIngresso(nome, cpf, meiaEntrada);

        System.out.print("          Compra realizada com sucesso!\n");
    }

    private static void exibirHorariosDeMaiorMovimento() {
        Map<Integer, Long> movimento = gerenciamento.horariosDeMaiorMovimento();
        System.out.println("Horários de maior movimento: " + movimento);
    }

    protected static void avaliarAtendimento() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua avaliação do atendimento (de 1 a 5): ");
        int avaliacaoAtendimento = scanner.nextInt();
        scanner.nextLine();
        Avaliacao.getAvaliacoes().add(new Avaliacao("teste", "teste",avaliacaoAtendimento));
        System.out.println("Avaliação do atendimento registrada com sucesso.");
    }

    protected static void avaliarAtracao() {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();

        System.out.print("Digite o nome da atração que você mais gostou: ");
        String atracaoFavorita = scanner.nextLine();
        System.out.print("Digite o nome da atração que você menos gostou: ");
        String atracaoMenosGostou = scanner.nextLine();

        sistema.avaliarAtracoes(atracaoFavorita, atracaoMenosGostou);
        System.out.println("Avaliações das atrações registradas com sucesso.");
       
    }
}