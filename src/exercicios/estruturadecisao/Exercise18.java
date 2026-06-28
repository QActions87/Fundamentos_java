package exercicios.estruturadecisao;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Armazena o 1º valor informado:
        System.out.println("Informe o 1º nº inteiro: ");
        int n1 = leitor.nextInt();
        // Armazena o 2º valor informado:
        System.out.println("Informe o 2º nº inteiro: ");
        int n2 = leitor.nextInt();
        // Verificar o maior número:
        if (n1 > n2) {
            System.out.print("O maior nº é: " + n1);
        } else {
            System.out.print("O maior nº é: " + n2);
        }

    }
}
