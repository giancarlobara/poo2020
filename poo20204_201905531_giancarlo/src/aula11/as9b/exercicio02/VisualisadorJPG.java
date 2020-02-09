/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.as9b.exercicio02;

/**
 *
 * @author usuario
 */
public abstract class VisualisadorJPG implements Imagem {

    public void Visualizar() {
        ImagemJPG img = new ImagemJPG() {};
        img.carregar();
        img.exibir();
        img.fechar();
    }
}
