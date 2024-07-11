package com.poo.introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuGestor {

    private Sistema sistema;
    private Scanner scanner;

    public MenuGestor(Sistema sistema) {
        this.sistema = sistema;
        this.scanner = new Scanner(System.in);
    }

    public void menuInterativo() {
        int opcao;
        do {
            System.out.println("Menu Gestor");
            System.out.println("1. Visualizar Funcionários");
            System.out.println("2. Alterar Funcionário");
            System.out.println("3. Incluir Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Visualizar Animais");
            System.out.println("6. Alterar Animal");
            System.out.println("7. Incluir Animal");
            System.out.println("8. Excluir Animal");
            System.out.println("9. Lançar Tarefas Diárias");
            System.out.println("10. Verificar Tarefas Executadas");
            System.out.println("11. Ver Avaliações dos Visitantes");
            System.out.println("12. Ver Faturamento do Parque");
            System.out.println("13. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    visualizarFuncionarios();
                    break;
                case 2:
                    alterarFuncionario();
                    break;
                case 3:
                    incluirFuncionario();
                    break;
                case 4:
                    excluirFuncionario();
                    break;
                case 5:
                    visualizarAnimais();
                    break;
                case 6:
                    alterarAnimal();
                    break;
                case 7:
                    incluirAnimal();
                    break;
                case 8:
                    excluirAnimal();
                    break;
                case 9:
                    lancarTarefasDiarias();
                    break;
                case 10:
                    verificarTarefasExecutadas();
                    break;
                case 11:
                    verAvaliacoesVisitantes();
                    break;
                case 12:
                    verFaturamentoParque();
                    break;
                case 13:
                    System.out.println("Saindo do menu gestor.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 13);
    }

    private void visualizarFuncionarios() {
        sistema.visualizarFuncionarios();
    }

    private void alterarFuncionario() {
        System.out.print("Digite o ID do funcionário a ser alterado: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        sistema.alterarFuncionario(id);
    }

    private void incluirFuncionario() {
        System.out.print("Digite o nome do novo funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do novo funcionário: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o tipo do funcionário (Atendente, Gestor, Cuidador): ");
        String tipo = scanner.nextLine();
        sistema.incluirFuncionario(nome, cpf, tipo);
    }

    private void excluirFuncionario() {
        System.out.print("Digite o ID do funcionário a ser excluído: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        sistema.excluirFuncionario(id);
    }

    private void visualizarAnimais() {
        sistema.visualizarAnimais();
    }

    private void alterarAnimal() {
        System.out.print("Digite o ID do animal a ser alterado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        sistema.alterarAnimal(id);
    }

    private void incluirAnimal() {
        System.out.print("Digite o nome do novo animal: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a espécie do novo animal: ");
        String especie = scanner.nextLine();
        sistema.incluirAnimal(nome, especie);
    }

    private void excluirAnimal() {
        System.out.print("Digite o ID do animal a ser excluído: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        sistema.excluirAnimal(id);
    }

    private void lancarTarefasDiarias() {
        System.out.print("Digite a tarefa diária: ");
        String tarefa = scanner.nextLine();
        sistema.lancarTarefaDiaria(tarefa);
    }

    private void verificarTarefasExecutadas() {
        sistema.verificarTarefasExecutadas();
    }

    private void verAvaliacoesVisitantes() {
        sistema.verAvaliacoesVisitantes();
    }

    private void verFaturamentoParque() {
        sistema.verFaturamentoParque();
    }
}