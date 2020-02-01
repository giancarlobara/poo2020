/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.salaaula.animal;

/**
 *
 * @author usuario
 */
public class MundoAnimal {
    public static void main(String[] args) {
        
        Animal reino[];
        reino = new Animal[3];
        
        reino[0] = new Anfibio("Salamandra");
        reino[1] = new Ave("Quero-quero");
        reino[2] = new Peixe("Dourado");
        
        for (int i = 0; i < 3; i++) {
            reino[i].mover(10, 10);
        }
    }
}
