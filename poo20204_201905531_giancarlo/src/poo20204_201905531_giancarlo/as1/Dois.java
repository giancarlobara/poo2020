/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo20204_201905531_giancarlo.as1;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Dois {

    public static void main(String[] args) {
        int x, y, z;
        x = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Segundo número:"));
        z = Integer.parseInt(JOptionPane.showInputDialog("Terceiro número:"));

        if (x >= y && y >= z) {
            System.out.println("A ordem crescente é:" + z + " " + y + " " + x);

        } else if (x >= z && z >= y) {
            System.out.println("A ordem crescente é:" + y + " " + z + " " + x);

        } else if (y >= x && x >= z) {
            System.out.println("A ordem crescente é:" + z + " " + x + " " + y);

        } else if (z >= y && y >= x) {
            System.out.println("A ordem crescente é:" + x + " " + y + " " + z);

        } else if (y >= z && z >= x) {
            System.out.println("A ordem crescente é:" + x + " " + z + " " + y);

        } else {
            System.out.println("A ordem crescente é:" + y + " " + x + " " + z);

        }
    }
}
