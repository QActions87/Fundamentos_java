package br.com.nu;

public class ContaBancariaNu {
    public String titular;
    public Double saldo;

    public ContaBancariaNu(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void atualizarSaldo(Double valor) {
        saldo += valor;
    }

    public String toString() {
        return "{ Titular: " + titular + ", Saldo: " + saldo + " }";
    }
}
