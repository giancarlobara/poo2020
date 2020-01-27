/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade1.empregadosnaempresa;

import aula04.as4.atividade1.enderecodeclientes.Endereco;

/**
 *
 * @author usuario
 */
public class TestaEmpregado {
    public static void main(String[] args) {
        Endereco y1 = new Endereco("Brasil", 666, "Perto do beco Itamaré", "01245551300", "Cidade de Deus","Ceres", "Goiás");
        Empresa x1 = new Empresa("Fubocas", "Salvar as pessoas fedidas", y1);
        
        Empregado e1 = new Empregado("Pedrito Nunes"," 05002020004", x1);
        Empregado e2 = new Empregado("Luizita Fagundes", "05002020007", x1);
        
        System.out.println(e1 + "\n" + e2);
    }
}
