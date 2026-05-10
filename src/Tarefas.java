import java.util.Scanner; // Importa a classe para leitura de dados do teclado

public class Tarefas {
	public static void main(String[] args) {
		// Inicializa um array de Strings com 10 posições fixas preenchidas com "x"
		// Este array servirá como nosso "banco de dados" temporário
		String[] tarefas = new String[] { "x", "x", "x", "x", "x", "x", "x", "x", "x", "x" };

		// Instancia o objeto scanner para capturar as entradas do usuário
		Scanner scanner = new Scanner(System.in);

		// Inicia um loop infinito. O programa rodará até encontrar um comando 'return'
		while (true) {
			// Exibição do menu de opções no console'
			System.out.println("\nOpções:");
			System.out.println("1. Cadastrar tarefa");
			System.out.println("2. Listar tarefas");
			System.out.println("3. Sair");

			// Captura a opção numérica escolhida pelo usuário
			int opcao = scanner.nextInt();

			// IMPORTANTE: Limpa o buffer do teclado.
			// Após ler um número (nextInt), o caractere de "Enter" sobra no buffer.
			// Se não limparmos, o próximo scanner.nextLine() lerá esse "Enter" vazio.
			scanner.nextLine();

			// Estrutura de decisão Switch para tratar as opções do menu
			switch (opcao) {
			case 1 -> { // Opção de Cadastro
				System.out.println("Digite o número da tarefa (1 à 10):");
				int numeroTarefa = scanner.nextInt();
				scanner.nextLine(); // Limpa o buffer novamente após ler o número

				// VALIDAÇÃO (Pensamento de QA): Verifica se o índice está dentro do limite do
				// array
				if (numeroTarefa <= 0 || numeroTarefa > 10) {
					System.out.println("Número da tarefa inválido.");
					continue; // Interrompe esta volta do loop e volta para o menu
				}

				System.out.println("Digite a descrição da tarefa:");
				String tarefa = scanner.nextLine();

				// Atribuição: O array começa em 0, mas o usuário digita de 1 a 10.
				// Por isso usamos [numeroTarefa - 1] para ajustar ao índice correto.
				tarefas[numeroTarefa - 1] = tarefa;
			}

			case 2 -> { // Opção de Listagem
				// Laço de repetição para percorrer todo o array
				for (int i = 0; i < tarefas.length; i++) {
					// System.out.printf: Imprime formatado.
					// %d = número inteiro (i + 1)
					// %s = String (tarefas[i])
					// %n = quebra de linha
					System.out.printf("Tarefa %d - %s%n", i + 1, tarefas[i]);
				}
			}

			default -> { // Qualquer opção diferente de 1 ou 2 cai aqui
				System.out.println("Encerrando programa...");
				scanner.close(); // Fecha o objeto scanner (boa prática de memória)
				return; // Encerra o método main e, consequentemente, o programa
			}
			}
		}
	}
}