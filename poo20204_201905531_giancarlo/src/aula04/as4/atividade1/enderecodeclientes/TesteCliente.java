/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade1.enderecodeclientes;

import aula04.as4.atividade1.alunosmatriculados.Aluno;

/**
 *
 * @author usuario
 */
public class TesteCliente {
    public static void main(String[] args) {
        
        Endereco e1 = new Endereco("Sucuri", 24, "Residecial Beco", "76472-300", "Juremeus", "Trinity", "Goias");
        Cliente c1 = new Cliente("Lindovagno", "1234567890", e1);
        
        Endereco e2 = new Endereco("Anaconda", 666, "Beco Residencial", "76421-300", "jequitiremeus", "Trinity", "Goias");
        Cliente c2 = new Cliente("Xubrescreusa", "1234566690", e2);
        
        System.out.println(c1 + "\n" + c2);
    }
}
