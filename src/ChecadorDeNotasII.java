import java.util.Scanner;

public class ChecadorDeNotasII {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a nota (A, B, C, D ou F)");
		String nota = scanner.nextLine();

		switch (nota) {
		case "A" -> System.out.println("Excelente!");
		case "B" -> System.out.println("Bom trabalho!");
		case "C" -> System.out.println("Está progredindo!");
		case "D" -> System.out.println("Precisa melhorar!");
		case "F" -> System.out.println("Você precisa estudar mais!");
		default -> System.out.println("Nota inválida!");
		}

	}

}
