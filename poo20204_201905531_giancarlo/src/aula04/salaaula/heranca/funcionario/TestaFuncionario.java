/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.salaaula.heranca.funcionario;

/**
 *
 * @author usuario
 */
public class TestaFuncionario {
    public static void main(String[] args) {
		Funcionario f = new Funcionario("Carlos", "191", 1000.0d);
		
		Funcionario g = new Gerente("Antonio Carlos", "123", 2000.0d);
		
		System.out.println("Valor do Salário do Funcionário Sem Bonificacao " 
				+ f.getSalario());
		System.out.println("Valor do Salário do Funcionário Com Bonificação " 
				+ f.calcularBonificacao());
		System.out.println("Valor do Salário do Gerente Sem Bonificação " 
				+ g.getSalario());
		System.out.println("Valor do Salário do Gerente Com Bonificação " 
				+ g.calcularBonificacao());
	}
}
