/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio04.agregacao;

/**
 *
 * @author usuario
 */
public class Carrinho {

    private Produto protudo;

    public Carrinho(Produto protudo) {
        this.protudo = protudo;
    }

    public void adicionarProduto(Produto produto) {
        produto.add(produto);
    }
    
}
