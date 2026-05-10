import java.util.Scanner; // Importa a ferramenta para ler a entrada do teclado

public class ComparandoArraysNumeros {
	public static void main(String[] args) {
		// Instancia o scanner para capturar os números digitados
		Scanner scanner = new Scanner(System.in);

		// Define dinamicamente o tamanho das duas estruturas de dados
		System.out.println("Digite o tamanho do primeiro array:");
		int tamanho1 = scanner.nextInt();
		System.out.println("Digite o tamanho do segundo array:");
		int tamanho2 = scanner.nextInt();

		// Alocação de memória para os arrays baseada nos tamanhos informados
		int[] array1 = new int[tamanho1];
		int[] array2 = new int[tamanho2];

		// Primeiro laço: Preenche o Array 1
		System.out.printf("Informe %d números do array 1:%n", tamanho1);
		for (int i = 0; i < tamanho1; i++) {
			array1[i] = scanner.nextInt();
		}

		// Segundo laço: Preenche o Array 2
		System.out.printf("Informe %d números do array 2:%n", tamanho2);
		for (int i = 0; i < tamanho2; i++) {
			array2[i] = scanner.nextInt();
		}

		// BLOCO DE COMPARAÇÃO (Interseção)
		// Utilizamos o 'for-each' (para cada): uma forma mais elegante de percorrer
		// arrays
		System.out.println("Números que aparecem em ambos os arrays:");
		for (int numero1 : array1) { // Pega um número do primeiro array...
			for (int numero2 : array2) { // ...e compara com todos os números do segundo array
				if (numero1 == numero2) { // Se encontrar uma igualdade (match)
					System.out.println("Número em comun: " + numero1); // Imprime o número comum
				}
			}
		}

		// Fecha o scanner para liberar os recursos do sistema
		scanner.close();
	}
}