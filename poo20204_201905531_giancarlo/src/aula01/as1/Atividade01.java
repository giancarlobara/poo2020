/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01.as1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Atividade01 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador;
        String nome;
        int matricula;
        
        contador = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de matriculas:"));
        
        for (int i = 0; i < contador; i++) {
            nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
            matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno:"));
            
            
            System.out.println("Aluno : " + nome + " - matricula : " + matricula);

        }
    }
}
