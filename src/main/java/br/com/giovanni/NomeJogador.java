package br.com.giovanni;

import java.util.Scanner;

public class NomeJogador {
    private String formatorNome(String nome){
        String [] partesNome = nome.split("\\s+");

        var nomeFormatado = new StringBuilder();
        for(String parte: partesNome){
            nomeFormatado.append(parte.substring(0, 1).toUpperCase());
            nomeFormatado.append(parte.substring(1).toLowerCase());
            nomeFormatado.append(" ");
        }
        return nomeFormatado.toString().trim();
    }

    public String jogador(Scanner scanner){
        String nomeJogador = "";
        boolean validacao = false;

        System.out.println("Bem vindo ao jogo do número secreto!");

        while(!validacao) {
            System.out.println("Digite seu nome: ");
            nomeJogador = scanner.nextLine().trim();
            if (nomeJogador.isBlank()) {
                System.out.println("Digite um nome válido.");
            } else {
                validacao = true;
            }
        }
        nomeJogador = formatorNome(nomeJogador);
        return nomeJogador;
    }
}
