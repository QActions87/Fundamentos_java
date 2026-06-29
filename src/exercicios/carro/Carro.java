package exercicios.carro;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private int velocidade;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void acelerar() {
        velocidade += 10;
    }

    public String getDetalhes() {
        return "Modelo: " + modelo + " Ano: " + ano + " Cor: " + cor + " Velocidade: " + velocidade;

    }
}


