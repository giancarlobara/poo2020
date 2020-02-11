/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.as02.exercicio05;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Pessoa {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        int idade;
        String nomePessoa;
        String mae;
        String pai;
        
        nomePessoa = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        mae = JOptionPane.showInputDialog("Digite o nome da mãe:");
        pai = JOptionPane.showInputDialog("Digite o nome do pai:");

         System.out.println("Nome da pessoa: " + nomePessoa + " de " + idade + " anos\nMãe: " + mae + "\nPai: " + pai );
    }
}
