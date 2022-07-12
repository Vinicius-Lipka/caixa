package br.com.lipka.caixaeletronico.services;

import br.com.lipka.caixaeletronico.model.Conta;
import br.com.lipka.caixaeletronico.repository.MemoriaContaRepository;

public class AbrirContaimpl implements AbrirConta{
    private final MemoriaContaRepository repository;

    public AbrirContaimpl(MemoriaContaRepository repository){
        this.repository = repository;
    }

    @Override
    public Conta execute() {
        Conta conta;
        conta = new Conta();
        repository.adiciona(conta);
        System.out.printf("Conta número%d o saldo é de R$ %.2f%n%n", conta.getNumeroDaConta(), conta.getSaldo());
        return conta;
    }
}
