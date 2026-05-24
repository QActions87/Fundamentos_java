import java.util.Scanner;

public class ChegadorDeIdadeIII {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();

		// If ternário
		String mensagem = (idade >= 18) ? "Pode comprar o ingresso!" : "Este evento é para maiores de idade";
		System.out.println(mensagem);

		scanner.close();

	}

}
