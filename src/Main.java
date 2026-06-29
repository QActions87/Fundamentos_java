import br.com.bb.ContaBancariaBB;
import br.com.nu.ContaBancariaNu;

public class Main {
    public static void main (String[] args) {
        ContaBancariaNu contaNu = new ContaBancariaNu("Udemy");
        ContaBancariaBB contaBB = new ContaBancariaBB("Udemy");

        contaNu.atualizarSaldo(50.0);
        contaBB.atualizarSaldo(50.0);
        contaBB.atualizarSaldo(-50.0);

        System.out.println(contaNu);
        System.out.println(contaBB);
    }
}
