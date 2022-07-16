package br.com.lipka.caixaeletronico.services;

import br.com.lipka.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoimpl implements ExecutarComandoEspecifico {
    // interface Saque saque;

    //public interface Saque {

    //  Double execute(double valor, String numeroDaConta);
    //}
    // interface Deposito deposito;
    //public interface Deposito {

    //  void execute(double valor, String numeroDaConta);
    //}
    private final Deposito deposito;
    private final AbrirConta abrirConta;
    private final Saque saque;
    private final Transferencia transferencia;

    public ExecutarComandoEspecificoimpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new Depositoimpl(repository);
        this.abrirConta = new AbrirContaimpl(repository);
        this.saque = new Saqueimpl(repository);
        this.transferencia = new Transferenciaimpl(repository);
    }

    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if (comando == 0) {
            System.out.print("Saindo da conta!");
            resultado = false;
        } else if (comando == 1) {
            this.abrirConta.execute();
        } else if (comando == 2) {
            System.out.println("Digite o número da conta");
            int numeroDaConta = entrada.nextInt();
            System.out.println("Digite o valor do saque");
            int valor = entrada.nextInt();
            saque.execute(numeroDaConta, valor);

        } else if (comando == 3) {
            System.out.println("Digite o número da conta");
            int numeroDaConta = entrada.nextInt();
            System.out.println("Digite o valor do depósito");
            int valor = entrada.nextInt();
            deposito.execute(numeroDaConta, valor);
        } else if (comando == 4) {
            System.out.println("Digite o número da conta de origem");
            int numeroContaOrigem = entrada.nextInt();
            System.out.println("Digite o valor da transferencia");
            int valor = entrada.nextInt();
            System.out.println("Digite o número da conta de destino");
            int numeroContaDestino = entrada.nextInt();
            this.transferencia.execute(numeroContaOrigem, valor, numeroContaDestino);
        } else {
            System.out.println("opcao invalida");
        }

        return resultado;
    }

}

