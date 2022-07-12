package br.com.lipka.caixaeletronico.services;

import br.com.lipka.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutarComandoEspecificoimpl implements ExecutarComandoEspecifico{
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

    public ExecutarComandoEspecificoimpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new Depositoimpl(repository);
        this.abrirConta = new AbrirContaimpl(repository);
        this.saque = new Saqueimpl(repository);
    }
    @Override
    public boolean execute(int comando) {
        Scanner entrada = new Scanner(System.in);
        boolean resultado = true;

        if(comando == 0){
            System.out.print("Saindo da conta!");
            resultado = false;
        }else if(comando ==1){
            System.out.println("Digite o número da conta");
            int numero = entrada.nextInt();
            System.out.println("Digite o valor do saque");
            double valor = entrada.nextDouble();
            saque.execute(valor, numero);

        }else if(comando ==2){
            System.out.println("Digite o número da conta");
            int numero = entrada.nextInt();

            //this.deposito.execute(10,1)
            System.out.println("Digite o valor do depósito");
            double valor = entrada.nextDouble();
            deposito.execute(valor, numero);
        }else if(comando ==3) {
            abrirConta.execute();
        }else {
            System.out.println("opcao invalida");
        }

        return resultado;
    }

}

