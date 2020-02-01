/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio01.abstrato;

/**
 *
 * @author usuario
 */
public class TestaVeiculo {

    public static void main(String[] args) {
        Modelo m1 = new Modelo("Batata 3000") {
        };
        Empregado e1 = new Empregado("24", "Girinos Soouza", 20, "Batata 3000") {
        };
        Veiculo v1 = new Veiculo(123456789, e1, "Batata 3000") {
        };
        e1.setNome("Juremeu");
        System.out.println(v1);
    }
}
