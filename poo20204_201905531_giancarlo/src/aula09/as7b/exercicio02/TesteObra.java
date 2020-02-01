/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio02;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class TesteObra {

    public static void main(String[] args) {
        ArrayList<Obra> obras = new ArrayList<Obra>();
        Artista a1 = new Artista("Leonardo da Vinci", "15/04/1452", "Anchiano,Itália");
        Artista a2 = new Artista("Sasha Grey", "14/03/1988", "California,EUA");
        Artista a3 = new Artista("Chris Wedge", "20/03/1957", "Nova York,EUA");
        Obra o1 = new Obra("Monalisa", 550000000, "1503", "Vendida", "Quadro", "Tinta a óleo", a1);
        Obra o2 = new Obra("GangBang#5", 0, "2006", "Disponível", "Filme Porno", "Corpos humanos", a2);
        Obra o3 = new Obra("Era do Gelo", 17.99, "2002", "Disponível", "Filme de animação", "Sequência de imagens", a3);
        
        obras.add(o3);
        obras.add(o2);
        obras.add(o1);

        for (int i = 0; i < obras.size(); i++) {
            System.out.println(obras.get(i).toString());
        }
    
    }
}
