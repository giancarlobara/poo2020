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
public class ProcessoColado implements EstadoProcesso{

    @Override
    public void protocolar(Processo p) {
          System.out.println("Processo já protocolado!");
    }

    @Override
    public void copiar(Processo p) {
        p.setEstadoAtual(new ProcessoCopiado());
    }

    @Override
    public void colar(Processo p) {
        System.out.println("Processo já colado!");
    }

    @Override
    public void cancelar(Processo p) {
        p.setEstadoAtual(new ProcessoCancelado());
    }

    @Override
    public void arquivar(Processo p) {
        p.setEstadoAtual(new ProcessoArquivado());

    }

        
}

