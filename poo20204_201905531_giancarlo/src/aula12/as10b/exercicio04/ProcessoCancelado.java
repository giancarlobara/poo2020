/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.as10b.exercicio04;

/**
 *
 * @author usuario
 */
public class ProcessoCancelado implements EstadoProcesso {

    @Override
    public void protocolar(Processo p) {
        p.setEstadoAtual(new ProcessoProtocolado());
    }

    @Override
    public void copiar(Processo p) {
        System.out.println("Processo Cancelado!!!");
    }

    @Override
    public void colar(Processo p) {
        System.out.println("Processo Cancelado!!!");
    }

    @Override
    public void cancelar(Processo p) {
        System.out.println("Processo já está cancelado!");
    }

    @Override
    public void arquivar(Processo p) {
        p.setEstadoAtual(new ProcessoArquivado());

    }

}
