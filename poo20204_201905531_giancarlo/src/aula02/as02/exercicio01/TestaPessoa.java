/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02.as02.exercicio01;

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import java.util.Scanner;


public class TestaPessoa {

    private static int Pessoa = 3;
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
        for (int i = 0; i < Pessoa; i++) {
            Pessoa novaPessoa = new Pessoa();

            System.out.println("Nome: ");
            novaPessoa.setNome(input.nextLine());
            System.out.println("Idade: ");
            novaPessoa.setIdade(input.nextInt());
            input.nextLine();
            listaDePessoas.add(novaPessoa);
        }

        Pessoa maisVelha, maisNova;
        maisVelha = maisNova = listaDePessoas.get(0);

        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getIdade() > maisVelha.getIdade()) {
                maisVelha = pessoa;
            } else if (pessoa.getIdade() < maisNova.getIdade()) {
                maisNova = pessoa;
            }
        }

        System.out.printf("Das 3 pessoas " + maisVelha.getNome() + " é a mais velha enquanto " + maisNova.getNome() + " é a mais nova.");

    }

}
