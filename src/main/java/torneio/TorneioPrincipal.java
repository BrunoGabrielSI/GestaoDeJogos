package torneio;

import model.Jogador;

import java.util.HashSet;
import java.util.Set;

public class TorneioPrincipal {
    private String nome;
    private Set<Jogador> jogadores;

    public TorneioPrincipal(String nome){
        this.nome = nome;
        this.jogadores = new HashSet<>();
    }

    public void adicionarJogador(Jogador jogador){
        if (this.jogadores.add(jogador)){
            System.out.printf("Jogador %s entrou no torneio. \n", jogador.getNome());
        }else {
            System.out.printf("Jogador %s já está no torneio. \n", jogador.getNome());

        }
    }

    public void exibirJogadores(){
        System.out.println("=== Jogadores do torneio - " + this.nome + " ===");
        this.jogadores.forEach(jogador -> System.out.println(jogador.getNome()));
    }

    public String getNome() {
        return nome;
    }

    public Set<Jogador> getJogadores() {
        return jogadores;
    }
}
