package br.com.giovanni;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class OJogo {
    private static int dificuldade(){
        return 100;
    }

    public int theGame(Scanner scanner, String jogador, HistoricoDePartidas historico){
        var random = new Random();
        int numeroSecreto = random.nextInt(dificuldade()) + 1;
        int palpite = 0;
        int tentativas = 0;
        boolean acertou = false;

        System.out.printf("%s escolha um número de 1 a %d\n", jogador, dificuldade());
        while (!acertou){
            tentativas++;

            System.out.println("Digite seu palpite: ");
            if(scanner.hasNextInt()){
                palpite = scanner.nextInt();
                if(palpite == numeroSecreto){
                    System.out.printf("""
                            Parabéns %s, o número secerto é %d.
                            Você acertou com %d tentativas.
                            """, jogador, numeroSecreto, tentativas);
                    acertou = true;

                    String data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
                    historico.adicionarJogada(String.format("Jogador: %-10s | Tentativas: %-5d | Data: %s",
                            jogador, tentativas, data));
                } else if (palpite < numeroSecreto) {
                    System.out.println("O número secreto é MAIOR");
                } else {
                    System.out.println("O número secreto é MENOR");
                }
            }else{
                String entradaInvalida = scanner.next();
                System.out.printf("""
                        '%s' não é uma opção válida!
                        Digite um número inteiro
                        """, entradaInvalida);
            }
        }
        return numeroSecreto;
    }
}
