
// Import do recurso de leitura do input:
import java.util.Scanner;

public class ImprimirArrayNumeros {

	public static void main(String[] args) {
		// Instância do recurso que lê o input do usuário:
		Scanner scanner = new Scanner(System.in);

		// Orienta o usuário digitar a tamanho do array:
		System.out.println("Digite o tamanho do array: ");
		int quantidade = scanner.nextInt();

		// Confirma a quantidade digitada e cria um array com este dado:
		System.out.println("O tamanho de seu array é: " + quantidade);
		int[] numeros = new int[quantidade];

		// Ler os números fornecidos pelo usuário e armazená-los no array números:
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite o próximo número do array: ");
			numeros[i] = scanner.nextInt();
		}

		// imprimir os números armazenados no array:
		for (int i = 0; i < quantidade; i++) {
			System.out.println(numeros[i]);
		}
		// Finalização do recurso de leitura:
		scanner.close();

	}

}
