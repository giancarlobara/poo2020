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
public class PessoaFisica extends Pessoa{
	private String cpf;
	private String estadoCivil;
	private String sexo;
	
	public PessoaFisica(String nome, String endereco, String telefone, 
			String cpf, String estadoCivil, String sexo) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nCPF da Pessoa Física: " + this.getCpf());
		sb.append("\nEstado Civil da Pessoa Física: " + this.getEstadoCivil());
		sb.append("\nSexo da Pessoa Física: " + this.getSexo());
		return sb.toString();
	}
}

