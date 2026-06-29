package exercicios.estruturadecisao;

import java.util.Scanner;

public class MasculinoOuFemininoSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu sexo? (digite M ou F): ");
        char letra = sc.next().charAt(0);

        switch(letra) {
            case 'F':
                System.out.println("F - Feminino.");
                break;
            case 'M':
                System.out.println("M - Masculino.");
                break;
            default:
                System.out.println("Opção Inválida.");
        }
    }
}
