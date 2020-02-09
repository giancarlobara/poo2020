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
public abstract class VisualizadorBMP implements Imagem{

    public void Visualizar() {
        ImagemBMP img = new ImagemBMP() {};
        img.carregar();
        img.exibir();
        img.fechar();
    }
} 
