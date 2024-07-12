package com.poo.introducao;

import java.util.Scanner;

public class MenuPrincipal {

    public static void limpaConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private Sistema sistema;
    private Scanner scanner;

    public MenuPrincipal(Sistema sistema) {
        this.sistema = sistema;
        this.scanner = new Scanner(System.in);
    }

    public void menuInterativo() {
        while (true) {
            System.out.println("            ╔═══╗╔══╗╔══╗╔╗──╔══╗╔═══╗╔══╗╔══╗╔══╗");
            System.out.println("            ╚═╗─║║╔╗║║╔╗║║║──║╔╗║║╔══╝╚╗╔╝║╔═╝║╔╗║");
            System.out.println("            ─╔╝╔╝║║║║║║║║║║──║║║║║║╔═╗─║║─║║──║║║║");
            System.out.println("            ╔╝╔╝─║║║║║║║║║║──║║║║║║╚╗║─║║─║║──║║║║");
            System.out.println("            ║─╚═╗║╚╝║║╚╝║║╚═╗║╚╝║║╚═╝║╔╝╚╗║╚═╗║╚╝║");
            System.out.println("            ╚═══╝╚══╝╚══╝╚══╝╚══╝╚═══╝╚══╝╚══╝╚══╝ \n\n");

            System.out.println(" ========================== DESCRIÇÃO ============================");
            System.out.println(
                    "| O nosso Zoológico é um espaço dedicado à preservação, cuidado   |\n| e exibição de diversas espécies de animais, proporcionando um   |\n|ambiente educativo e de entretenimento para os nossos visitantes.|");
            System.out.println(" =================================================================\n\n");

            System.out.println("            ______________________________________");
            System.out.println("           |=========== MENU PRINCIPAL ===========|");
            System.out.println("           |                                      |");
            System.out.println("           | 1. Menu de Visitante                 |");
            System.out.println("           | 2. Menu de Administrador             |");
            System.out.println("           | 0. Sair                              |");
            System.out.println("           |______________________________________|");
            System.out.print("           Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            limpaConsole();

            switch (opcao) {
                case 1:
                    MenuVisitante.menuInicial();
                    limpaConsole();
                    break;
                case 2:
                    new MenuGestor(sistema).menuInterativo();
                    limpaConsole();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    limpaConsole();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    limpaConsole();
            }
        }
    }
}
