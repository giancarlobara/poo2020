/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio04.agregacao;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        

    public void adiciona(Produto produto) {
        produto.add(produto);
        total += produto.getProduto().getValor() * produto.getQuantidade();
    }
}

