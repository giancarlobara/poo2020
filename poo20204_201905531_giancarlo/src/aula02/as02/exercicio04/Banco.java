/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.as02.exercicio04;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Banco {
    public static void main(String[] args) {
        
    double saldoMedio;
    double creditoEspecial = 0;
    
    saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("O saldo médio é: "));
    if(saldoMedio <= 200){
        creditoEspecial = 0;
    }
    else if (saldoMedio <= 400) {
            creditoEspecial = saldoMedio * .2;
        }
    else if (saldoMedio <= 600) {
            creditoEspecial = saldoMedio * .3;
        }
    else{
            creditoEspecial = saldoMedio * .4;
        }
        System.out.println("O saldo é: R$" + saldoMedio + " e o crédito especial é: R$" + creditoEspecial); 
    }
       
}
