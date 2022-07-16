package br.com.lipka.caixaeletronico.model;

public class Conta {
    private int numeroDaConta;
    private double saldo;

    private double numeroContaDestino;

    public Conta() {
        saldo = 0;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }



   /** public double getNumeroContaDestino() {
        return numeroContaDestino;
    }


    public void setNumeroContaDestido(double numeroContaDestido) {
        this.numeroContaDestino = numeroContaDestido;
    }
*/
    public void adicionaSaldo(int valor) {
        saldo = saldo + valor;

    }

    public boolean retirarSaldo(int valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}
