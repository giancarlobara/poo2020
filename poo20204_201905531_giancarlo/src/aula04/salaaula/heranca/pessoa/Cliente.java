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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente extends PessoaFisica{
	private double renda;
	private List<Interesse> interesses;
	private String profissao;
	
	public Cliente(String nome, String endereco, String telefone, 
			String cpf, String estadoCivil, String sexo,
			double renda, String profissao) {
		super(nome, endereco, telefone, cpf, estadoCivil, sexo);
		this.renda = renda;
		this.profissao = profissao;
		interesses = new ArrayList<Interesse>();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString());
		sb.append("\nRenda do Cliente: " + this.getRenda());
		sb.append("\nProfissão do Cliente: " + this.getProfissao());
		return sb.toString();
		
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public List<Interesse> getInteresses() {
		return interesses;
	}

	public void setInteresses(List<Interesse> interesses) {
		this.interesses = interesses;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void adicionaInteresse(Interesse interesse) {
		this.getInteresses().add(interesse);
	}
	
	//Retorna uma lista porque pode ter mais de um interesse do mesmo tipo.
	public List<Interesse> consultaInteressePeloTipo(String tipo) {
		List<Interesse> listaInteresses = new ArrayList<Interesse>(); 
		for(Interesse i : this.getInteresses()) {
			if(i.getTipo().equals(tipo)) {
				listaInteresses.add(i);
			}
		}
		
		return listaInteresses;
	}
	
	public Interesse consultaInteressePeloNome(String nome) {
		Interesse novoInteresse = null; 
		for(Interesse i : this.getInteresses()) {
			if(i.getNome().equals(nome)) {
				novoInteresse = i;
			}
		}
		
		return novoInteresse;
	}
	
	//removendo passando o nome como parâmetro
	public void removeInteresse(String nomeInteresse) {
		
		Iterator<Interesse> iterator = interesses.iterator();
		
		while (iterator.hasNext()){
			Interesse interesseRemover = iterator.next();
			if (interesseRemover.getNome().equals(nomeInteresse)){
				iterator.remove();
			}
		}
		
	}
	
	//removendo passando o objeto como parâmetro
		public void removeInteresse(Interesse interesse) {
			interesses.remove(interesse);
		}
    
}
