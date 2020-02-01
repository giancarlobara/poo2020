/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio01.interfac;

/**
 *
 * @author usuario
 */
public abstract class Empregado implements Modelo {

    private String codigo;
    private String nome;
    private int idade;

    public Empregado(String codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Empregado{" + "codigo=" + codigo + ", nome=" + nome + ", idade=" + idade + '}';
    }
    @Override
     public void imprimir() {
     }
}
