package com.poo.introducao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroducaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroducaoApplication.class, args);
        limpa();

        Sistema sistema = new Sistema();
        MenuPrincipal menuPrincipal = new MenuPrincipal(sistema);
        menuPrincipal.menuInterativo();

    }

    static void limpa() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (System.getProperty("os.name").contains("Linux")
                    || System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Este comando não funciona no seu sistema operacional.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
