import java.util.Scanner;

public class ChecadorDeNotasIII {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a nota (A, B, C, D ou F)");
		String nota = scanner.nextLine();

		String mensagem = switch (nota) {
		case "A" -> "Excelente!";
		case "B" -> "Bom trabalho!";
		case "C" -> "Está progredindo!";
		case "D" -> "Precisa melhorar!";
		case "F" -> "Você precisa estudar mais!";
		default -> "Nota inválida!";
		};
		System.out.println(mensagem);

		scanner.close();
	}

}