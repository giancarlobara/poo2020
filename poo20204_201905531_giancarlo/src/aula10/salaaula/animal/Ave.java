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
public class Ave extends Animal {
    public Ave(String nome){
        super(nome);
    }
    public void mover(int x, int y) {
        setCoordenadas(x, y);
        System.out.println("Movimento da Ave");
    } 
}
