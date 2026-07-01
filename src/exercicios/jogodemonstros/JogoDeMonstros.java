package exercicios.jogodemonstros;

public class JogoDeMonstros {
    public void iniciarJogo(Jogador[] jogadores) {
        for(Jogador jogador : jogadores)
            jogador.derrotarMonstro();
    }
}
