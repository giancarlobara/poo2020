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
import java.util.List;

public class HerancaTeste {

	public static void main(String[] args) {
		
		//A referência do objeto é a classe Pessoa. A instância é da classe Cliente.
		Pessoa pessoa = new Cliente("Carlos", "Goiânia", "3521-1181", 
				"191", "Solteiro", "Masculino", 
				5000.00, "Professor");
				
		System.out.println("Dados do Cliente: " + pessoa.toString());
		
		//Pessoa não conhece Cliente. Por isto é necessário o uso do operador intanceof. Explicarei em maiores detalhes
		//na aula sobre polimorfismo.
		if(pessoa instanceof Cliente) {
		
			//fazendo um downcast da pessoa para o cliente
			Cliente c = (Cliente) pessoa;
			
			//instanciando os interesses do cliente
			Interesse i1 = new Interesse("Esporte", "Futebol");
			Interesse i2 = new Interesse("Esporte", "Voleibol");
			Interesse i3 = new Interesse("Arte", "Cinema");
			Interesse i4 = new Interesse("Arte", "Literatura");
			Interesse i5 = new Interesse("Politica", "Desenvolvimento Social");
			
			//adicionando os interesses à lista de interesses da pessoa
			c.getInteresses().add(i1);
			c.getInteresses().add(i2);
			c.getInteresses().add(i3);
			c.getInteresses().add(i4);
			c.getInteresses().add(i5);
			
			//consultando um interesse pelo tipo
			System.out.println("\nResultado da consulta de um interesse pelo tipo");
			List<Interesse> listaInteresses = c.consultaInteressePeloTipo("Esporte");
			
			if(listaInteresses.size() > 0) {
				System.out.println(listaInteresses.toString());
			}else {
				System.out.println("Interesse não encontrado!");
			}
			
			//consultando um interesse pelo nome
			System.out.println("\nResultado da consulta de um interesse pelo Nome");
			Interesse algumInteresse = c.consultaInteressePeloNome("Literatura");
			
			if(algumInteresse != null) {
				System.out.println(algumInteresse.toString());
			}else {
				System.out.println("Interesse não encontrado!");
			}
			
			System.out.println("Imprimindo a lista de interesses atual que tem " + c.getInteresses().size() + " elementos");
			System.out.println(c.getInteresses().toString());
			
			//Removendo um interesse a partir do seu nome
			c.removeInteresse("Futebol");
			
			System.out.println("\nImprimindo a lista de interesse após a remoção por nome. Agora está com " + c.getInteresses().size() + " elementos");
			System.out.println(c.getInteresses().toString());
			
			
			//Removendo um interesse a partir da referência do objeto
			c.removeInteresse(i3);
			
			System.out.println("\nImprimindo a lista de interesse após a remoção pela referência do objeto. Agora está com " + c.getInteresses().size() + " elementos");
			System.out.println(c.getInteresses().toString());
		}
	}

}
