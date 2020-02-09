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
public class ImagemJPG implements Imagem{

    public void carregar() {
        System.out.println("Imagem JPG:");
        System.out.println("Carregando imagem JPG...");
        System.out.print("...");
        System.out.print("...");
        System.out.print("");
    }

    public void exibir() {
        System.out.println("Exibindo imagem por 20 segundos.");
    }

    public void fechar() {
        System.out.println("Fechando imagem.");
    }
}
