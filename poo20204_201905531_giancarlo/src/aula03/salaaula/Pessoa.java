/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.salaaula;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Pessoa {
    //Atributos
	private String nome;
	private Date dataNascimento;
	public final String especie = "mamifero";
	
	
	//Métodos
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nNome: " + this.getNome());
		sb.append("\nDataNascimento: " + this.getDataNascimento());
		return sb.toString();
	}
    
}
