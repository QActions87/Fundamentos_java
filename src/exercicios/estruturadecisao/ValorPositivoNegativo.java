package exercicios.estruturadecisao;

import java.util.Scanner;

public class ValorPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = sc.nextInt();

        if (valor > 0) {
            System.out.printf("O valor %d é positivo.%n", valor);
        } else if (valor < 0) {
            System.out.printf("O valor %d é negativo.%n", valor);
        } else {
            System.out.printf("O valor é zero (neutro).%n");
        }
        sc.close();
    }
}
