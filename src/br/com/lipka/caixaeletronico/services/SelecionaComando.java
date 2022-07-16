package br.com.lipka.caixaeletronico.services;

public class SelecionaComando {

    private final ListarComandos listarComandos;
    private final ObtemComando obtemComando;
    private final ExecutarComandoEspecifico executarComandoEspecifico;
    public SelecionaComando() {
        this.listarComandos = new ListarComandosimpl();
        this.obtemComando = new ObtemComandoimpl();
        this.executarComandoEspecifico = new ExecutarComandoEspecificoimpl();
    }
    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return executarComandoEspecifico.execute(comando);
    }

}
