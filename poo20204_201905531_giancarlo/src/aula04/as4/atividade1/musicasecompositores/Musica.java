/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade1.musicasecompositores;

/**
 *
 * @author usuario
 */
public class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    public Musica(String nome, int ano, String tipo, Compositor compositor) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
    }
    
    public String toString(){
        return "Nome: " + nome + " - Ano: " + ano + " - Tipo: " + tipo + " - Compositor: " + compositor.getNome();
    }
    
    
}
