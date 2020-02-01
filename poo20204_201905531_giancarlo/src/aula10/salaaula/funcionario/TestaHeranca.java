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
public class TestaHeranca {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSalario(3000);
        System.out.println("A bonificacao do gerente é: " + g.bonificacao());

        Funcionario f = new Funcionario();
        f.setSalario(3000);
        System.out.println("A bonificacao do funcionário é: " + f.bonificacao());

        Funcionario ger = new Gerente();
        ger.setSalario(3000);
        System.out.println("O valor da bonificacao é: " + ger.bonificacao());
    }

}
