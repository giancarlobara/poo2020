/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.as10b.exercicio02;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Pasta {
    private String nome;
    private ArrayList<Arquivo> listaArquivos;

    public Pasta(String nome) {
        this.nome = nome;
        listaArquivos = new ArrayList<Arquivo>();
    }

    public void adicionaArquivo(Arquivo arquivoNovo) {
        listaArquivos.add(arquivoNovo);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Arquivo> getListaArquivos() {
        return listaArquivos;
    }

}
