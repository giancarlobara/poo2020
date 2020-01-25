/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade1.alunosmatriculados;

/**
 *
 * @author usuario
 */
public class TesteAluno {
    public static void main(String[] args) {
        
        Departamento d1 = new Departamento("Jubileu", "JUB");
        Curso c1 = new Curso("Sacrofagia", "Sac", d1);
        
        Aluno a1 = new Aluno("Jeremias", 66623, 2020, c1);
        Aluno a2 = new Aluno("Jurema", 66624, 2020, c1);
        
        System.out.println(a1 + "\n" + a2);
    }
}
