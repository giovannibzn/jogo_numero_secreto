package br.com.giovanni;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HistoricoDePartidas {
    List<String> historico = new ArrayList<>();

    public void adicionarJogada(String jogadas){
        historico.add(jogadas);
    }

    public void historicoDeJogadas(){
        System.out.println("Histórico de partidas jogdas:");
        if(historico.isEmpty()){
            System.out.println("Nenhuma partida foi jogada");
        } else {
            historico.sort(Comparator.comparing(jgds ->{
                String[]args = jgds.split("\\|");
                return Integer.parseInt(args[1].trim().split(":")[1].trim());
            }));
        }

        for (int i = 0; i < historico.size(); i++){
            System.out.printf("%dº %s\n", i + 1, historico.get(i));
        }
    }
}
