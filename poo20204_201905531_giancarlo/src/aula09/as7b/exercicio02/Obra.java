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
public class Obra {
    private String titulo;
    private double preco;
    private String dataDeCriacao;
    private String situacao;
    private String tipo;
    private String material;
    private Artista artista;

    public Obra(String titulo, double preco, String dataDeCriacao, String situacao, String tipo, String material, Artista artista) {
        this.titulo = titulo;
        this.preco = preco;
        this.dataDeCriacao = dataDeCriacao;
        this.situacao = situacao;
        this.tipo = tipo;
        this.material = material;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Obra{" + "titulo=" + titulo + ", preco=" + preco + ", dataDeCriacao=" + dataDeCriacao + ", situacao=" + situacao + ", tipo=" + tipo + ", material=" + material + ", artista=" + artista.getNome() + '}';
    }

          
}
