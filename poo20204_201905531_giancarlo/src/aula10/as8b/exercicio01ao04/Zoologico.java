/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.as8b.exercicio01ao04;



/**
 *
 * @author usuario
 */
public class Zoologico {
    private Animal[] jaulas;

    public Zoologico(int quantidade) {
        this.jaulas = new Animal[quantidade];
    }

    public Zoologico() {
        this.jaulas = new Animal[10];
    }

    public Animal[] getJaulas() {
        return jaulas;
    }

    public void setJaulas(Animal[] jaulas) {
        this.jaulas = jaulas;
    }

}
