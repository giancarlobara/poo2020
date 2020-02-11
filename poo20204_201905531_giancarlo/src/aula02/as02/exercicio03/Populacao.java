/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.as02.exercicio03;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Populacao {

    public static void main(String aegs[]) {
        Scanner teclado = new Scanner(System.in);
        int maiorIdade = 0;
        int idade = 0;
        int cabelo;
        int olho;
        int sexo;
        int tipoIndividuo = 0;
        int i;
        int count = 0;
        int porcentagemTipoIndividuo = 0;

        while (idade != -1) {
            System.out.print("Sexo:   1-Masculino  2-Feminino \n");
            sexo = teclado.nextInt();

            System.out.print("Cor dos olhos:   1-Azuis  2-Verdes  3-Castanhos \n ");
            olho = teclado.nextInt();

            System.out.print("Cor dos cabelos:   1-Louros  2-Castanhos 3-Pretos \n");
            cabelo = teclado.nextInt();

            System.out.print("Idade: ");
            idade = teclado.nextInt();
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if ((sexo == 2) && (idade > 17 && idade < 36) && (olho == 2) && (cabelo == 1)) {
                tipoIndividuo++;
            }
            count++;

        }
        porcentagemTipoIndividuo = (tipoIndividuo * 100) / (count - 1);
        System.out.println("A maior idade do grupo é " + maiorIdade + "\nPorcentagem tipo de indivíduo selecionado é " + porcentagemTipoIndividuo + "%");
    }
}
