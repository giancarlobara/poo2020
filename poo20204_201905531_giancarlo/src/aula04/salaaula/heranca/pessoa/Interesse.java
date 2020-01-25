/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.salaaula.heranca.pessoa;

/**
 *
 * @author usuario
 */
public class Interesse {
    private String tipo;
	private String nome;
	
	public Interesse(String t, String n) {
		this.tipo = t;
		this.nome = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getTipo() + "\t- " + this.getNome() + "\n");
		return sb.toString();
	}

}
