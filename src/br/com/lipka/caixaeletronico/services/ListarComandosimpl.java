package br.com.lipka.caixaeletronico.services;

public class ListarComandosimpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("\nSelecione a opção desejada:");
        System.out.println("0 - Sair da conta.");
        System.out.println("1 - Sacar.");
        System.out.println("2 - Depositar.");
    }
}
