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
public final class Incremental {

    private static int count = 0;
    private int numero;
    private static Incremental instancia;

    private Incremental() {
        numero = ++count;
    }

    public static Incremental getInstancia() {
        if (instancia == null) {
            instancia = new Incremental();
        }
        return instancia;
    }

    public String toString() {
        return "incremental " + numero;
    }
}
