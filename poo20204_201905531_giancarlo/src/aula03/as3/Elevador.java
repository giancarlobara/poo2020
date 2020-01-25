/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.as3;

/**
 *
 * @author usuario
 */
public class Elevador {
    
    private int total;
    private int atual;
    private int capacidade;
    private int lotacao; 
    
    public void inicializa(int capacidade, int total){
        this.atual = 0;
        this.lotacao = 0;
        this.capacidade = capacidade;
        this.total = total;
    }
    
    public void entra(){
        if(lotacao < capacidade){
            lotacao++;
        }
    }
    
    public void sai(){
        if(lotacao > 0){
            lotacao--;
        }
    }
    
    public void sobe() {
        if(atual != total){
            atual++;
        }
    }
    
    public void desce() {
        if(atual != 0)
        {
            atual--;
        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAtual() {
        return atual;
    }

    public void setAtual(int atual) {
        this.atual = atual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
    
}
