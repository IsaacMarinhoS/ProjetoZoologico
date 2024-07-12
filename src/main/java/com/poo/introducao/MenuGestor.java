package com.poo.introducao;

import java.util.Scanner;

public class MenuGestor {

    public static void limpaConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private Sistema sistema;
    private Scanner scanner;

    public MenuGestor(Sistema sistema) {
        this.sistema = sistema;
        this.scanner = new Scanner(System.in);
    }

    public void menuInterativo() {
        int opcao;
        do {
            System.out.println("            ______________________________________");
            System.out.println("           |=========== MENU PRINCIPAL ===========|");
            System.out.println("           |1. Visualizar Funcionários            |");
            System.out.println("           |2. Alterar Funcionário                |");
            System.out.println("           |3. Incluir Funcionário                |");
            System.out.println("           |4. Excluir Funcionário                |");
            System.out.println("           |5. Visualizar Animais                 |");
            System.out.println("           |6. Alterar Animal                     |");
            System.out.println("           |7. Incluir Animal                     |");
            System.out.println("           |8. Excluir Animal                     |");
            System.out.println("           |9. Lançar Tarefas Diárias             |");
            System.out.println("           |10. Verificar Tarefas Executadas      |");
            System.out.println("           |11. Ver Avaliações dos Visitantes     |");
            System.out.println("           |12. Ver Faturamento do Parque         |");
            System.out.println("           |13. Sair                              |");
            System.out.println("           |______________________________________|");
            System.out.print("           Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    visualizarFuncionarios();

                    break;
                case 2:
                    alterarFuncionario();
                    limpaConsole();
                    break;
                case 3:
                    incluirFuncionario();
                    limpaConsole();
                    break;
                case 4:
                    excluirFuncionario();
                    limpaConsole();
                    break;
                case 5:
                    visualizarAnimais();
                    limpaConsole();
                    break;
                case 6:
                    alterarAnimal();
                    limpaConsole();
                    break;
                case 7:
                    incluirAnimal();
                    limpaConsole();
                    break;
                case 8:
                    excluirAnimal();
                    limpaConsole();
                    break;
                case 9:
                    lancarTarefasDiarias();
                    limpaConsole();
                    break;
                case 10:
                    verificarTarefasExecutadas();
                    limpaConsole();
                    break;
                case 11:
                    verAvaliacoesVisitantes();
                    limpaConsole();
                    break;
                case 12:
                    verFaturamentoParque();
                    
                    break;
                case 13:
                    System.out.println("Saindo do menu gestor.");
                    limpaConsole();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    limpaConsole();
            }
        } while (opcao != 13);
    }

    private void visualizarFuncionarios() {
        sistema.visualizarFuncionarios();
    }

    private void alterarFuncionario() {
       
            System.out.print("          Digite o ID do funcionário a ser alterado: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            sistema.alterarFuncionario(id);
        }
    

    private void incluirFuncionario() {
        System.out.print("               Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("               Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();
        System.out.print("               Digite o tipo do funcionário (cuidador, atendente, gestor): ");
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