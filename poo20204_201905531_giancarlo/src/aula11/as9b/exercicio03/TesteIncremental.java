/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.as9b.exercicio03;

/**
 *
 * @author usuario
 */
public class TesteIncremental {

    public static void main(String[] args) {
        Incremental incremental = null;
        
        for (int i = 0; i < 10; i++) {
            
            Incremental inc = Incremental.getInstancia();
            System.out.println(inc);
        }
    }
}
