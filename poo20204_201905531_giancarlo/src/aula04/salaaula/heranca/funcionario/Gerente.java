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
public class Gerente extends Funcionario {
	
	public Gerente(String n, String c, double s) {
		super(n,c,s);
	}
	
	@Override
	public double calcularBonificacao() {
		double salario = this.getSalario();
		return salario *= 1.15;
	}
}

