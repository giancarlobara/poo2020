/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio01.interfac;

/**
 *
 * @author usuario
 */
public class TestaVeiculo {

    public static void main(String[] args) {
        Empregado e1 = new Empregado("24", "Girinos Souza", 20) {
        };
        Veiculo v1 = new Veiculo(25879566, e1) {
        };
        e1.setNome("Juremeu");
        System.out.println(v1);
    }
}
