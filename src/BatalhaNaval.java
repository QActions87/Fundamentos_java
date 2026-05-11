import java.util.Scanner; // Importa o Scanner para ler as coordenadas via teclado

public class BatalhaNaval {
	public static void main(String[] args) {
		// Declaração da Matriz 5x5. Imagine um papel quadriculado com 5 linhas e 5
		// colunas.
		char[][] tabuleiro = new char[5][5];

		// Variáveis de controle de estado do jogo
		int tentativas = 10; // Contador regressivo de chances
		int naviosRestantes = 3; // Condição de vitória: chegar a 0

		Scanner scanner = new Scanner(System.in);

		// INICIALIZAÇÃO DO TABULEIRO
		// Usamos laços aninhados para percorrer cada "célula" da matriz.
		for (int i = 0; i < tabuleiro.length; i++) { // Percorre as linhas (0 a 4)
			for (int j = 0; j < tabuleiro[i].length; j++) { // Percorre as colunas (0 a 4)
				tabuleiro[i][j] = '~'; // Preenche cada espaço com o char '~' (representando água)
			}
		}

		// POSICIONAMENTO DOS NAVIOS (Setup do Jogo)
		// Aqui o usuário define onde os 3 navios ficarão escondidos.
		System.out.println("Digite as posições dos navios: ");

		System.out.println("Navio 1: ");
		int linhaNavio1 = scanner.nextInt();
		int colunaNavio1 = scanner.nextInt();

		System.out.println("Navio 2: ");
		int linhaNavio2 = scanner.nextInt();
		int colunaNavio2 = scanner.nextInt();

		System.out.println("Navio 3: ");
		int linhaNavio3 = scanner.nextInt();
		int colunaNavio3 = scanner.nextInt();

		// Atribui o caractere 'N' nas coordenadas escolhidas na matriz.
		// 'N' marca a presença oculta de um navio.
		tabuleiro[linhaNavio1][colunaNavio1] = 'N';
		tabuleiro[linhaNavio2][colunaNavio2] = 'N';
		tabuleiro[linhaNavio3][colunaNavio3] = 'N';

		System.out.println("Bem-vindo ao jogo de Batalha Naval!");
		System.out.println("Você tem 10 tentativas para afundar 3 navios.");

		// LOOP PRINCIPAL DO JOGO
		// O jogo continua enquanto houver tentativas E navios no mar.
		while (tentativas > 0 && naviosRestantes > 0) {

			// EXIBIÇÃO DO TABULEIRO (Interface do Usuário)
			System.out.println("\n  0 1 2 3 4"); // Cabeçalho numérico das colunas
			for (int i = 0; i < tabuleiro.length; i++) {
				System.out.print(i + " "); // Número da linha no início de cada linha
				for (int j = 0; j < tabuleiro[i].length; j++) {
					// Imprime o conteúdo da célula (Água, Navio ou X de tiro dado)
					System.out.print(tabuleiro[i][j] + " ");
				}
				System.out.println(); // Pula linha para a próxima fileira do tabuleiro
			}

			System.out.println("Tentativas restantes: " + tentativas);
			System.out.print("Digite a linha e a coluna (0-4): ");
			int linha = scanner.nextInt();
			int coluna = scanner.nextInt();

			// VALIDAÇÃO DE ENTRADA (Boundary Testing)
			// Impede que o programa quebre por tentar acessar um índice que não existe (ex:
			// linha 5)
			if (linha < 0 || linha > 4 || coluna < 0 || coluna > 4) {
				System.out.println("Posição inválida. Tente novamente.");
				continue; // Retorna ao início do while sem gastar tentativa
			}

			// LÓGICA DE TIRO
			// Verifica o que existe na coordenada digitada:
			if (tabuleiro[linha][coluna] == 'X') {
				// Se já tem um 'X', o jogador já atirou ali antes.
				System.out.println("Você já tentou essa posição. Tente novamente.");
				continue;
			} else if (tabuleiro[linha][coluna] == 'N') {
				// ACERTO: Se encontrar um 'N', o navio é atingido.
				System.out.println("Você acertou um navio!");
				tabuleiro[linha][coluna] = 'X'; // Substitui 'N' por 'X' para marcar o acerto
				naviosRestantes--; // Decrementa a meta de vitória
			} else {
				// ERRO: Se encontrar '~' (água).
				System.out.println("Você errou.");
				tabuleiro[linha][coluna] = 'X'; // Marca com 'X' para o jogador saber que ali já foi tentado
			}

			// Gasta uma tentativa após cada jogada válida (acerto ou erro)
			tentativas--;
		}

		// FINALIZAÇÃO (Verificação do vencedor)
		if (naviosRestantes == 0) {
			System.out.println("Parabéns! Você afundou todos os navios.");
		} else {
			System.out.println("Você perdeu. Os navios sobreviveram.");
		}

		scanner.close(); // Fecha o fluxo do scanner
	}
}