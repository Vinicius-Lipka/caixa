package br.com.lipka.caixaeletronico.services;

import br.com.lipka.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class Depositoimpl implements Deposito{
    private double saldo;

    public Depositoimpl(MemoriaContaRepository repository) {
    }

    @Override
    public double execute(double valor,String numeroDaConta) {
        System.out.println("Digite o numero da conta:");
        Scanner entrada = new Scanner(System.in);
        numeroDaConta = entrada.nextLine();

        System.out.println("Digite o valor desejado:");
        Scanner entrada2 = new Scanner(System.in);
        valor = entrada2.nextDouble();
        return saldo + valor;
    }
}
