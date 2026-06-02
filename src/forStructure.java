
public class forStructure {

	public static void main(String[] args) {
		// número para calcular o fatorial:
		int n = 5;
		// Armazena o resultado:
		int fatorial = 1;

		// Loop que calcula o fatorial de n:
		for (int i = 1; i <= n; i++) {
			System.out.println("Valor de i: " + i + ", Fatorial atual: " + fatorial);
			// Multiplica o fatorial atual por i, e atribui ao fatorial, atualizando-o:
			fatorial *= i;
		}
		System.out.println("O fatorial de " + n + " é: " + fatorial);
	}

}
