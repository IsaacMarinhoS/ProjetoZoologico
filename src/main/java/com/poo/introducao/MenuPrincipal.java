package com.poo.introducao;

import java.util.Scanner;

public class MenuPrincipal {

    private Sistema sistema;
    private Scanner scanner;

    public MenuPrincipal(Sistema sistema) {
        this.sistema = sistema;
        this.scanner = new Scanner(System.in);
    }

    public void menuInterativo() {
        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Menu de Visitante");
            System.out.println("2. Menu de Administrador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                     MenuVisitante.menuInicial();
                    break;
                case 2:
                    new MenuGestor(sistema).menuInterativo();
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

