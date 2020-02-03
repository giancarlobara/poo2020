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
public class Produto {
    private String tipo;
    private int quantidade;
    private String codigoDeBarra;
    private String preco;

    public Produto(String tipo, int quantidade, String codigoDeBarra, String preco) {
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.codigoDeBarra = codigoDeBarra;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    void add(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
