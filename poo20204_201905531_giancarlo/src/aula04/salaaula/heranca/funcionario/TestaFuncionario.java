/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.salaaula.heranca.funcionario;

/**
 *
 * @author guest-0reedp
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Giancarlo", "1234567890", 10000.0d);

        Funcionario g = new Funcionario("Vitoria", "6662466624", 20000.0d);

        System.out.println("Valor do Salario sem Bonificacao: " + f.getSalario());

        System.out.println("Valor do Salario do Funcionario Com Bonificacao: " + f.calcularBonificaçao());

        System.out.println("Valor do Salario do Gerente sem Bonificacao: " + g.getSalario());

        System.out.println("Valor do Salario do Gerente Com Bonificacao:" + g.calcularBonificaçao());
    }

}
