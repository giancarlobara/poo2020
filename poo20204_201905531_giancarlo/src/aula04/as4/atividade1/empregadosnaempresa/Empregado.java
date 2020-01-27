/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade1.empregadosnaempresa;

/**
 *
 * @author usuario
 */
public class Empregado {

    private String nome;
    private String matricula;
    private Empresa empresa;

    public Empregado(String nome, String matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    
    public String toString() {
        return "Nome:" + nome + " - Matrícula: " + matricula + " - Empresa: " + empresa.getCnpj() + 
                " - Razão: " + empresa.getRazao() + " Endereco: " + "Rua: " + empresa.getEndereco().getRua() 
                + " - Numero: " + empresa.getEndereco().getNumero() + " - Complemento: " + empresa.getEndereco().getComplemento() 
                + " - CEP: " + empresa.getEndereco().getCep() + " - Bairro: " + empresa.getEndereco().getBairro() + " - " 
                + empresa.getEndereco().getCidade() + " - " + empresa.getEndereco().getEstado();
    }
}
