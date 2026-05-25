import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int num = 7, tentativas = 5;
		Scanner sc = new Scanner(System.in);
		// Loop de tentativas:
		while (tentativas > 0) {
			System.out.println("Digite um número entre 1 e 10: ");
			int chute = sc.nextInt();
			// Verifica se o chute é igual ao num sorteado:
			if (chute == num) {
				System.out.println("Parabéns! Acertou o número!");
				// Caso o user acerte, o break para o programa:
				break;
			} else {
				// Caso não acerte, as tentativas serão decrementadas:
				tentativas--;
			}
		}
		sc.close();

	}

}
