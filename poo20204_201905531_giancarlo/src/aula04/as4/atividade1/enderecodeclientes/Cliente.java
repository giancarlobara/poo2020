/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade1.enderecodeclientes;

/**
 *
 * @author usuario
 */
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + " - cpf: " + cpf + "\nEndereco: " + "Rua: " + endereco.getRua() 
                + " - Numero: " + endereco.getNumero() + " - Complemento: " + endereco.getComplemento() 
                + " - CEP: " + endereco.getCep() + " - Bairro: " + endereco.getBairro() + " - " 
                + endereco.getCidade() + " - " + endereco.getEstado();
    }
    
}
