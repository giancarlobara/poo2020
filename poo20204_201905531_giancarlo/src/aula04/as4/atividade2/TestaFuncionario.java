/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        int matricula;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a matricula:");
        matricula = sc.nextInt();
        String rua, complemento, bairro, cidade, estado, cpf, nome, cargo, departamento;
        int numero, quadra, lote;
        double salario;
        while (matricula != 0) {
            sc.nextLine();
            System.out.println("Digite a rua:");
            rua = sc.nextLine();
            System.out.println("Digite o numero:");
            numero = sc.nextInt();
            System.out.println("Digite a quadra:");
            quadra = sc.nextInt();
            System.out.println("Digite o lote:");
            lote = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o complemento:");
            complemento = sc.nextLine();
            System.out.println("Digite o bairro:");
            bairro = sc.nextLine();
            System.out.println("Digite a cidade:");
            cidade = sc.nextLine();
            System.out.println("Digite o estado:");
            estado = sc.nextLine();
            Endereco e = new Endereco(rua, numero, quadra, lote, complemento, bairro, cidade, estado);
            System.out.println("Digite o cpf:");
            cpf = sc.nextLine();
            System.out.println("Digite o nome:");
            nome = sc.nextLine();
            System.out.println("Digite o cargo:");
            cargo = sc.nextLine();
            System.out.println("Digite o salario:");
            salario = sc.nextDouble();
            sc.nextLine();
            System.out.println("Digite o departamento:");
            departamento = sc.nextLine();
            Funcionario f = new Funcionario(cpf, matricula, nome, cargo, salario, departamento, e);
            funcionarios.add(f);

            System.out.println("Digite a matricula:");
            matricula = sc.nextInt();
        }
        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).calcularBonificacao(30);
            System.out.println(funcionarios.get(i).toString());
        }
    }
}
