/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo20204_201905531_giancarlo.as1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class tres {

    public static void main(String[] args) {

        int contador;
        int numeros[];
        contador = Integer.parseInt(JOptionPane.showInputDialog("Informar a quantidade de números:"));
        numeros = new int[contador];

        for (int i = 0; i < contador; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        }

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        for (int i = (numeros.length - 1); i > -1; i--) {
            System.out.print(numeros[i] + " ");
        }

        int pesquisaNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para se pesquisar"));
        boolean contemNumero = PesquiseNumero(pesquisaNumero, numeros);

        if (!contemNumero) 
        {
            System.out.println("Numero não enontrado");
        }

    }

    public static boolean PesquiseNumero(int numero, int[] numeros) 
    {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero);
            {
                System.out.println("Numero encontrado na posição " + (i + 1));
                return true;
            }
            
        }
        return false;
    }
}
