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
public class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, int matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }
    
    public String toString(){
        return("Nome: " + nome + " - Matricula: " + matricula + " - Ano: " + ano + 
                " - Curso: " + curso.getNome() + " - Departamento: " + curso.getDepartamento().getNome() + 
                "/" + curso.getDepartamento().getSigla());
    }
    
}
