package br.com.lipka.caixaeletronico.services;

import br.com.lipka.caixaeletronico.model.Conta;
import br.com.lipka.caixaeletronico.repository.MemoriaContaRepository;

public class Transferenciaimpl implements Transferencia {
    private final MemoriaContaRepository repository;

    public Transferenciaimpl(MemoriaContaRepository repository){ this.repository = repository;}


    @Override
    public void execute(int valor, int numeroContaOrigem, int numeroContaDestino) {
        Conta contaOrigem;
        contaOrigem = repository.findById(numeroContaOrigem);
        Conta contaDestino;
        contaDestino = repository.findById(numeroContaDestino);
        contaOrigem.retirarSaldo(valor);
        contaDestino.adicionaSaldo(valor);

        System.out.println("Conta de débito: " + numeroContaOrigem);
        System.out.printf("Valor da transferência: R$%.2f%n", valor);
        System.out.println("Conta para crédito: " + numeroContaDestino);
        System.out.println();
        System.out.printf("Transferência efetuada com sucesso! %nO saldo atualizado é de R$%.2f.%n%n", contaOrigem.getSaldo());
        System.out.printf("Transferência recebida com sucesso! %nO saldo atualizado é de R$%.2f. %n%n", contaDestino.getSaldo());


    }
}

