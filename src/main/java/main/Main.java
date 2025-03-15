package main;

import jogos.Torneio;
import model.Jogador;
import torneio.Estatistica;
import torneio.TorneioPrincipal;

public class Main {
    public static void main(String[] args) {
        // Criando jogadores
        Jogador maria = new Jogador("Maria", 0);
        Jogador joao = new Jogador("João", 0);
        Jogador bruno = new Jogador("Bruno", 0);
        Jogador jose = new Jogador("José", 0);
        Jogador ana = new Jogador("Ana", 0);
        Jogador douglas = new Jogador("Douglas", 0);

        // Criando primeiro torneio
        Torneio torneio1 = new Torneio("Torneio de Verão");
        torneio1.adicionarJogador(maria);
        torneio1.adicionarJogador(joao);
        torneio1.adicionarJogador(bruno);

        System.out.println("\n🔹 Iniciando " + torneio1 + "...");
        torneio1.simularTorneio();
        torneio1.exibirRankingFinal();

        // Criando segundo torneio
        Torneio torneio2 = new Torneio("Torneio de Inverno");
        torneio2.adicionarJogador(jose);
        torneio2.adicionarJogador(ana);
        torneio2.adicionarJogador(douglas);

        System.out.println("\n🔹 Iniciando " + torneio2 + "...");
        torneio2.simularTorneio();
        torneio2.exibirRankingFinal();

        // Torneio Principal
        TorneioPrincipal torneioPrincipal = new TorneioPrincipal("Torneio LDS I - 15/03");
        torneioPrincipal.adicionarJogador(bruno);
        torneioPrincipal.adicionarJogador(douglas);

        torneioPrincipal.exibirJogadores();

        // Estatísticas
        Estatistica estatistica = new Estatistica(torneioPrincipal);
        estatistica.registrarPontuacao(bruno, 110);
        estatistica.registrarPontuacao(douglas, 180);
        estatistica.registrarPontuacao(bruno, 200);
        estatistica.registrarPontuacao(douglas, 260);

        estatistica.exibirPontuacoes();
        estatistica.exibirVencedorTorneio();
    }
}
