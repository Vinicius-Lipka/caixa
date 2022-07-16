package br.com.lipka.caixaeletronico.services;

import java.sql.SQLOutput;

public class ListarComandosimpl implements ListarComandos {

    @Override
    public void execute() {
        System.out.println("\nSelecione a opção desejada:");
        System.out.println("0 - Sair da conta.");
        System.out.println("1 - Abrir conta.");
        System.out.println("2 - Sacar.");
        System.out.println("3 - Depositar.");
        System.out.println("4 - Transferencia.");
    }
}
