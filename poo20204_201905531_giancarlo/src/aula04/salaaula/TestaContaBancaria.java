/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.salaaula;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class TestaContaBancaria {
    public static void main(String[] args) {
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setNumero(324566);
		contaBancaria.setSaldo(15000.0d);
		contaBancaria.setLimite(500.0d);
		contaBancaria.setTipo("Corrente");
		
		List<Cliente> clientes = new ArrayList<>();
		
		Cliente cli = new Cliente();
		cli.setNome("João Carlos dos Santos");
		cli.setEndereco("Rua Sucupira n. 35, Parque Amazonas, Goiânia/GO");
		cli.setCpf("191");
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Maria Aparecida de Oliveira");
		cli1.setEndereco("Rua Sucupira n. 35, Parque Amazonas, Goiânia/GO");
		cli1.setCpf("234.324.656-78");
		
		clientes.add(cli);
		clientes.add(cli1);
		
		contaBancaria.setTitulares(clientes);
		
		System.out.println("Nome dos Titulares da Conta: ");
		for (Cliente c : contaBancaria.getTitulares()) {
			System.out.println(c.getNome());
		}

    }
}