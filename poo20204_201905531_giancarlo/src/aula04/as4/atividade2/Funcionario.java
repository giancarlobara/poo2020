/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade2;

/**
 *
 * @author usuario
 */
public class Funcionario {

    private String cpf;
    private int matricula;
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;
    private Endereco endereco;

    public Funcionario(String cpf, int matricula, String nome, String cargo, double salario, String departamento, Endereco endereco) {
        this.cpf = cpf;
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
        this.endereco = endereco;
    }
    public void calcularBonificacao(double n) {
            this.salario *= (1 + (n / 100));
	}
    
    public String toString(){
        return matricula + " - " + cpf + " - " + nome + " - Departamento: " + departamento + " - Cargo: " + cargo + " - Salario:R$ " + salario + "\n";  
    }
}
