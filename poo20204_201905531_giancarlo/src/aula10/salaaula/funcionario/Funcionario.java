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
public class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    public double bonificacao() {
        double b = salario * 0.10;
        return b;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
