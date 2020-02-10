/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14.salaaula.as12;

import aula10.as8b.exercicio01.*;

/**
 *
 * @author usuario
 */
public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    Cavalo(String cavalo, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void correr() {
        System.out.println("Cavalo correndo");
    }

    public void emitirSom() {
        System.out.println("Hiin in in hinir");
    }
}
