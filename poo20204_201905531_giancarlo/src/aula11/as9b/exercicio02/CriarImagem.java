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
public class CriarImagem {

    public Imagem create(String tipoDeImagem) {
        if (tipoDeImagem.equalsIgnoreCase("JPG")) {
            return new ImagemJPG();
        } else if (tipoDeImagem.equalsIgnoreCase("BMP")) {
            return new ImagemBMP();
        } else {
            throw new IllegalArgumentException("Tipo de Imagem não suportado");
        }
    }

}
