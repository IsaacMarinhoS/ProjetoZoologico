package com.poo.introducao;

import java.util.Scanner;

public class MenuVisitante {
    private Sistema sistema;
    private Scanner scanner;

    public MenuVisitante(Sistema sistema) {
        this.sistema = sistema;
        this.scanner = new Scanner(System.in);
    }

    public void menuInterativo() {
        while (true) {
            System.out.println("\nMenu de Visitante:");
            System.out.println("1. Comprar Ingresso");
            System.out.println("2. Avaliar Atendimento");
            System.out.println("3. Avaliar Atração Favorita");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    comprarIngresso();
                    break;
                case 2:
                    avaliarAtendimento();
                    break;
                case 3:
                    avaliarAtracao();
                    break;
                case 0:
                    System.out.println("Saindo do Menu de Visitante...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void comprarIngresso() {
        System.out.println("\nOpção 1. Comprar Ingresso selecionada.");
        
     
        System.out.print("Digite seu nome: ");
        String nomeVisitante = scanner.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpfVisitante = scanner.nextLine();
    
        if (sistema.verificarCompraIngresso(cpfVisitante)) {
            System.out.println("Você já comprou ingresso com este CPF.");
            return;
        }
      
        System.out.println("Selecione o tipo de ingresso:");
        System.out.println("1. Inteira R$ 49,50");
        System.out.println("2. Meia-entrada R$ 24,75");
        System.out.println("Escolha uma opção: ");
        double inteira = scanner.nextDouble();
        double meiaEntrada = scanner.nextDouble();
        scanner.nextLine(); 
        
        sistema.comprarIngresso (nomeVisitante, cpfVisitante, inteira, meiaEntrada);
        System.out.println("Seu ingresso foi comprado com sucesso");
     
    }
    

    private void avaliarAtendimento() {
        System.out.println("\nOpção 2. Avaliar Atendimento selecionada.");
        
        System.out.print("Digite sua avaliação do atendimento (de 1 a 5): ");
        int avaliacaoAtendimento = scanner.nextInt();
        scanner.nextLine(); 
        
        sistema.avaliarAtendimento(avaliacaoAtendimento);
        System.out.println("Avaliação do atendimento registrada com sucesso.");
    }

    private void avaliarAtracao() {
        System.out.println("\nOpção 3. Avaliar Atração Favorita selecionada.");
        
       
        System.out.print("Digite o nome da atração que você mais gostou: ");
        String atracaoFavorita = scanner.nextLine();
        System.out.print("Digite o nome da atração que você menos gostou: ");
        String atracaoMenosGostou = scanner.nextLine();
        
        sistema.avaliarAtracoes(atracaoFavorita, atracaoMenosGostou);
        System.out.println("Avaliações das atrações registradas com sucesso.");
    }
}