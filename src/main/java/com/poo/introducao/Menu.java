package com.poo.introducao;

public class Menu {
   
    public void menu(){
            Sistema sistema = new Sistema();

            Visitante visitante1 = sistema.adicionarVisitante("João", "12345678900");
            Visitante visitante2 = sistema.adicionarVisitante("Maria", "09876543211");

            visitante1.comprarIngresso("inteira");
            visitante2.comprarIngresso("meia");

            visitante1.avaliarAtendimento(5);
            visitante1.avaliarAtracao("Leões", 4);
            visitante2.avaliarAtendimento(3);
            visitante2.avaliarAtracao("Elefantes", 5);

            Gestor gestor = (Gestor) sistema.adicionarFuncionario("Carlos", "12345678901", "gestor");
            Cuidador cuidador = (Cuidador) sistema.adicionarFuncionario("Ana", "12345678902", "cuidador");

            Animal animal1 = sistema.adicionarAnimal("Simba", "Leão", cuidador);
            Animal animal2 = sistema.adicionarAnimal("Dumbo", "Elefante", cuidador);

            gestor.lancarTarefa(new Tarefa("Alimentar Simba", cuidador));
            gestor.lancarTarefa(new Tarefa("Limpar recinto do Dumbo", cuidador));

            cuidador.realizarTarefa(gestor.verificarTarefasExecutadas().get(0));

            System.out.println("Tarefas executadas: " + gestor.verificarTarefasExecutadas().size());
            System.out.println("Tarefas em aberto: " + gestor.verificarTarefasAbertas().size());
        }
    }

