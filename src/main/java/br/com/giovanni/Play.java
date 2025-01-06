package br.com.giovanni;

import java.util.Scanner;

public class Play {
    public void chamarMetodo() {
        var leitor = new Scanner(System.in);
        var nomeJogador = new NomeJogador();
        var jogo = new OJogo();
        var opcaoEscolhida = new Escolha();
        var historico = new HistoricoDePartidas();
        String nome;
        String opcao;

        do {
            nome = nomeJogador.jogador(leitor);
            jogo.theGame(leitor, nome, historico);
            opcao = opcaoEscolhida.opcaoEscolhida(leitor);
        }while (opcao.isBlank());

        historico.historicoDeJogadas();

        System.out.println("Caraca, acho que foi tudo ;) ;) ;)");
        System.out.println("Encerrando...");

        leitor.close();
    }
}
