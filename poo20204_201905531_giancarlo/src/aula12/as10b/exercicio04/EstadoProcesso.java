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
public interface EstadoProcesso {
    public void protocolar(Processo p);
    public void copiar(Processo p);
    public void colar(Processo p);
    public void cancelar(Processo p);
    public void arquivar(Processo p);
    
}
