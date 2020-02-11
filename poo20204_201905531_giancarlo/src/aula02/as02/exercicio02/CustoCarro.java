/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.as02.exercicio02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class CustoCarro {

    public static void main(String[] args) {
        Double custoFabrica;
        Double custoFinal;
        DecimalFormat df = new DecimalFormat("0.00"); // Procurei mas n consegui por 2 casas decimais
        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Preço de fábrica do carro: "));

        custoFinal = (custoFabrica * .28) + (custoFabrica * .45);
        System.out.println("O custo para o consumidor é de : R$" + custoFinal);
    }
}
