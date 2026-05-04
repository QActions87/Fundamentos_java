// Checador de idade.

import java.util.Scanner;

public class ChecadorDeIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a sua idade: ");
		int idade = scanner.nextInt();

		if (idade >= 18) {
			System.out.println("Pode comprar o ingresso!");
		} else {
			System.out.println("Este evento é para maiores de 18 anos!");
		}

		scanner.close();

	}

}
