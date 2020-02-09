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
public class Processo {

    EstadoProcesso estadoAtual;

    public Processo() {
        estadoAtual = new ProcessoProtocolado();
    }

    public void protocolar() {
        estadoAtual.protocolar(this);
    }

    public void copiar() {
        estadoAtual.copiar(this);
    }

    public void colar() {
        estadoAtual.colar(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }

    public void arquivar() {
        estadoAtual.arquivar(this);
    }
    public EstadoProcesso getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoProcesso estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

}
