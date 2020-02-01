/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio02;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Artista {
    private String nome;
    private String dataDeNascimento;
    private String localDeNascimento;

    public Artista(String nome, String dataDeNascimento, String localDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.localDeNascimento = localDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getLocalDeNascimento() {
        return localDeNascimento;
    }

    public void setLocalDeNascimento(String localDeNascimento) {
        this.localDeNascimento = localDeNascimento;
    }

}
