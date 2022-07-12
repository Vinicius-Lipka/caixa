package br.com.lipka.caixaeletronico;

import br.com.lipka.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {
        System.out.println("Caixa eletronico ligando!");
        SelecionaComando selecionaComando = new SelecionaComando();
        while (selecionaComando.executar()) {
            System.out.println("execute um novo comando!");
        }
            System.out.println("Caixa eletronico desligando!");

    }
}
