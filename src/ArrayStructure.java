
public class ArrayStructure {

	public static void main(String[] args) {
		// Declarar e Inicializar:
		String[] tarefas = { "Estudar Java", "Fazer Exercícios", "Tomar Café" };

		// Acessar Posições do Array:
		System.out.println(tarefas[0]);
		System.out.println(tarefas[1]);
		System.out.println(tarefas[2]);

		// Atualizar posição do Array:
		tarefas[2] = "Limpar a Casa";
		System.out.println(tarefas[2]);

		// Tamanho do Array através do atributo 'length':
		System.out.println("Você possui " + tarefas.length + " tarefas.");

		// Percorrer / Iterar Arrays com FOR:
		for (int i = 0; i < tarefas.length; i++) {
			System.out.print(tarefas[i] + " ");
		}
		// Percorrer / Iterar Arrays com FOREACH:
		for (String tarefa : tarefas) {
			System.out.print(tarefa + " ");
		}

	}

}
