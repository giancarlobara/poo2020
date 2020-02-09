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
public class CarregarImagem {

    public static void main(String[] args) {

        Imagem imagem;

        imagem = new CriarImagem().create("JPG");

        imagem = new CriarImagem().create("BMP");

        try {
            imagem = new CriarImagem().create("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
