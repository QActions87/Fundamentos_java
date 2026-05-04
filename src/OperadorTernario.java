// Operador Ternário:

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();

		String mensagem = (idade >= 18) ? "Pode comprar o ingresso" : "Este evento é para maiores de 18 anos!";
		System.out.println(mensagem);

		scanner.close();
	}

}
