/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.salaaula.heranca;

/**
 *
 * @author guest-0reedp
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(String n, String c, double s){
        this.nome = n;
        this.cpf = c;
        this.salario = s;
    }
    
    public double calcularBonificaçao(){
        return this.salario *= 1.1;
    }
    
    public double getSalario(){
        return salario;
    }
}
