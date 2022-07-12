package br.com.lipka.caixaeletronico.services;

import br.com.lipka.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class Saqueimpl implements Saque{
    private double saldo;

    public Saqueimpl(MemoriaContaRepository repository) {
    }

    @Override
    public double execute(double valor,String numeroDaConta){
        System.out.println("Digite o número da conta:");
        Scanner entrada = new Scanner(System.in);
        numeroDaConta = entrada.nextLine();

        System.out.println("Digite o valor desejado:");
        Scanner entrada2 = new Scanner(System.in);
        valor = entrada2.nextDouble();

        if (valor < saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
            System.out.println("Saldoatual:" + saldo);
        }
        return saldo;
    }
}
