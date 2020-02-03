/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio03;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class TestaCliente {

    public static void main(String[] args) {
        
        ArrayList<Venda>vendas = new ArrayList<Venda>();
        
        Cliente c1 = new Cliente("Vitória Gomes", "66606660", "996474568");
        Cliente c2 = new Cliente("Giancarlo", "01234436128", "994785648");
        Cliente c3 = new Cliente("Edironaldo", "256458745666", "9966621455");
        
        Venda v1 = new Venda("Noite Estrelada", "24/03/1997", c1);
        Venda v2 = new Venda("Monalisa", "09/03/2000", c2);
        Venda v3 = new Venda("Eu fedo", "24/01/1666", c3);
        
        vendas.add(v1);
        vendas.add(v2);
        vendas.add(v3);
        
        for (int i = 0; i < vendas.size(); i++) {
            System.out.println(vendas.get(i).toString());
        }

    }
}
