package br.com.lipka.caixaeletronico.services;

import br.com.lipka.caixaeletronico.repository.MemoriaContaRepository;

import br.com.lipka.caixaeletronico.model.Conta;

public class Saqueimpl implements Saque{ private final MemoriaContaRepository repository;

    public Saqueimpl(MemoriaContaRepository repository) {this.repository = repository;}

    @Override
    public void execute(int numeroDaConta, int valor){
        Conta conta;
        conta = repository.findById(numeroDaConta);

       conta.retirarSaldo(valor);



            System.out.printf("Saque Efetuado! Seu saldo atual é R$%.2f%n%n", conta.getSaldo());

    }
}
