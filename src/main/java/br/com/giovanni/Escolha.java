package br.com.giovanni;

import java.util.Scanner;

public class Escolha {
    public String opcaoEscolhida(Scanner scanner){
        scanner.nextLine();
        System.out.println("Digite ENTER para continuar ou outra tecla para sair");
        return scanner.nextLine();
    }
}
