package exercicios.estruturadecisao;

import java.util.Scanner;

public class MasculinoOuFeminino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu sexo? (digite M ou F): ");
        char letra = sc.next().charAt(0);

        if (letra == 'M') {
            System.out.println("Seu sexo é M - Masculino.");
        } else if (letra == 'F') {
            System.out.println("Seu sexo é F - Feminino.");
        } else {
            System.out.println("Opção inválida!");
        }
        sc.close();
    }
}
