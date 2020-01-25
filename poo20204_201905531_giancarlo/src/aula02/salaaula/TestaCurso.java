/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.salaaula;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TestaCurso {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
				
		//Curso 1
		Curso curso1 = new Curso();
		System.out.println("Entre com o nome do curso");
		curso1.nome = sc.nextLine();
		
		System.out.println("Entre com a área do curso");
		curso1.area = sc.nextLine();
		
		System.out.println("Entre com a duração do curso");
		curso1.duracao = Integer.parseInt(sc.nextLine());
		
		System.out.println("Entre com o tipo do curso");
		curso1.tipo = sc.nextLine();
		
		
		
		//Curso 2
		
		Curso curso2 = new Curso();
		System.out.println("Entre com o nome do curso");
		curso2.nome = sc.nextLine();
		
		System.out.println("Entre com a área do curso");
		curso2.area = sc.nextLine();
		
		System.out.println("Entre com a duração do curso");
		curso2.duracao = Integer.parseInt(sc.nextLine());
		
		System.out.println("Entre com o tipo do curso");
		curso2.tipo = sc.nextLine();
		
		System.out.println("Curso 1: " + curso1.nome + " - " 
				+ curso1.area + " - " + curso1.tipo + " - " + curso1.duracao);
		
		System.out.println("Curso 2: " + curso2.nome + " - " 
				+ curso2.area + " - " + curso2.tipo + " - " + curso2.duracao);
		
		
		
	}
}
