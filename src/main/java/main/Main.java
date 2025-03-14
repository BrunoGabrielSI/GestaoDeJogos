package main;

import jogos.Torneio;
import model.Jogador;
import jogos.Ranking;

public class Main {
    public static void main(String[] args) {
            Ranking ranking = new Ranking();

            Jogador jogador1 = new Jogador("Maria", (int) (Math.random() * 1000));
            Jogador jogador2 = new Jogador("João", (int) (Math.random() * 1000));
            Jogador jogador3 = new Jogador("Pedro", (int) (Math.random() * 1000));

            System.out.println(jogador1);
            System.out.println(jogador2);
            System.out.println(jogador3);

            ranking.adicionarJogador(jogador1);
            ranking.adicionarJogador(jogador2);
            ranking.adicionarJogador(jogador3);

            ranking.exibirRanking();
        }
    }