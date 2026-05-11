import java.util.Scanner; // Importa a classe para capturar entradas do usuário

public class AgendaCompromissos {
	public static void main(String[] args) {
		// Array unidimensional para os rótulos dos dias
		String[] diasDaSemana = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo" };

		// Array bidimensional (Matriz).
		// Imaginamos como 7 linhas (dias), mas cada linha começa com 0 colunas
		// (compromissos).
		String[][] compromissos = new String[7][0];

		Scanner scanner = new Scanner(System.in);

		// Loop principal para manter o menu ativo
		while (true) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Exibir compromissos");
			System.out.println("2. Cadastrar compromisso");
			System.out.println("3. Sair");

			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1 -> {
				// Percorre as 7 linhas da matriz (os dias)
				for (int i = 0; i < compromissos.length; i++) {
					System.out.println("\n" + diasDaSemana[i] + ":");

					// Percorre o array interno de cada dia (as colunas/compromissos)
					for (String compromisso : compromissos[i]) {
						System.out.println("- " + compromisso);
					}
				}
			}
			case 2 -> {
				System.out.println("\nDigite o dia da semana (1-Segunda à 7-Domingo):");
				int dia = scanner.nextInt();

				// Validação de intervalo (Boundary Testing / Teste de Limite)
				if (dia >= 1 && dia <= 7) {
					scanner.nextLine(); // Limpa o buffer para não pular a leitura do texto

					System.out.println("Digite o compromisso:");
					String compromisso = scanner.nextLine();

					int diaDoCompromisso = dia - 1; // Ajusta para o índice do Java (0-6)

					// --- LÓGICA DE REDIMENSIONAMENTO ---
					// Como arrays em Java são fixos, precisamos "trocar" o array por um maior

					// 1. Pega o tamanho atual da lista de compromissos daquele dia
					int tamanhoAtual = compromissos[diaDoCompromisso].length;

					// 2. Cria um novo array temporário com uma posição a mais (+1)
					String[] novosCompromissos = new String[tamanhoAtual + 1];

					// 3. Copia todos os compromissos antigos para o novo array
					for (int i = 0; i < tamanhoAtual; i++) {
						novosCompromissos[i] = compromissos[diaDoCompromisso][i];
					}

					// 4. Adiciona o novo compromisso na última posição disponível
					novosCompromissos[tamanhoAtual] = compromisso;

					// 5. Substitui o array antigo pelo novo dentro da matriz principal
					compromissos[diaDoCompromisso] = novosCompromissos;
				} else {
					System.out.println("Dia inválido!");
				}
			}
			default -> {
				System.out.println("Saindo...");
				scanner.close(); // Libera o recurso do teclado
				return; // Encerra o programa
			}
			}
		}
	}
}