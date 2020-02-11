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
public class TesteAnimal {
    public static void main(String[] args)
    {
        Cavalo cavalo = new Cavalo();
        Cachorro cachorro = new Cachorro();
        Preguica preguica = new Preguica();
        System.out.println("Cavalo:");
        cavalo.emitirSom();
        System.out.println("Cachorro:");
        cachorro.emitirSom();
        System.out.println("Preguiça:");
        preguica.emitirSom();
        
    }
}
