package br.com.lipka.caixaeletronico.services;

import br.com.lipka.caixaeletronico.repository.MemoriaContaRepository;
import br.com.lipka.caixaeletronico.model.Conta;

public class Depositoimpl implements Deposito {

    private final MemoriaContaRepository repository;

    public Depositoimpl(MemoriaContaRepository repository) {this.repository = repository;}


    @Override
    public void execute(int numeroDaConta, int valor) {
       Conta conta;
       conta= repository.findById(numeroDaConta);
       conta.adicionaSaldo(valor);
        System.out.printf("valor Depositado! Seu Saldo atual é R$ %.2f%n%n", conta.getSaldo());


    }
}
