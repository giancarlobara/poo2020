/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.as8b.exercicio01ao04;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class TestaZoologico {

    public static void main(String[] args) {

        int quantidade = 10;

        Animal[] jaulas = new Animal[quantidade];

        for (int i = 0; i < 10; i++) {
            String nome = JOptionPane.showInputDialog("qual o nome do bicho");
            if (nome.equalsIgnoreCase("cachorro")) {
                Animal cachorro = new Cachorro();
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade?"));
                cachorro.setIdade(idade);
                jaulas[i] = cachorro;
            } else if (nome.equalsIgnoreCase("cavalo")) {
                Animal cavalo = new Cavalo();
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade?"));
                cavalo.setIdade(idade);
                jaulas[i] = cavalo;
            } else {
                Animal preguica = new Preguica();
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade?"));
                preguica.setIdade(idade);
                jaulas[i] = preguica;
            }

        }
    }
}