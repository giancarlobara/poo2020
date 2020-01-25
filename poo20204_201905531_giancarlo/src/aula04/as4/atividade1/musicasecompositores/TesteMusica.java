/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade1.musicasecompositores;

/**
 *
 * @author usuario
 */
public class TesteMusica {
    public static void main(String[] args) {
        
        Compositor c1 = new Compositor("Massacration", "brasileira");
        Musica m1 = new Musica("Metal Bucetation", 2005, "Metal", c1);
        
        Compositor c2 = new Compositor("Pearl Jam", "americana");
        Musica m2 = new Musica("Sirens", 2013, "Grunge", c2); 
        
        System.out.println(m1 + "\n" + m2);
    }
    
}
