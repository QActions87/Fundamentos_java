import java.util.Scanner;

public class StringNotas {

	public static void main(String[] args) {
		String texto = "Hello World! I got rid of the curse!";
		System.out.println(texto);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		System.out.println("Seu nome é: " + nome);

		scanner.close();

	}

}
