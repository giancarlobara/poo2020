/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.salaaula.funcionario;

/**
 *
 * @author usuario
 */
public class Gerente extends Funcionario {

    private int senha;

    public double bonificacao() {
        double b = salario * 0.15;
        return b;
    }
}
