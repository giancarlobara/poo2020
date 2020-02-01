/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio01.abstrato;

/**
 *
 * @author usuario
 */
public abstract class Modelo {
    String tituloDoProjeto;

    public Modelo(String tituloDoProjeto) {
        this.tituloDoProjeto = tituloDoProjeto;
    }

    public String getTituloDoProjeto() {
        return tituloDoProjeto;
    }

    public void setTituloDoProjeto(String tituloDoProjeto) {
        this.tituloDoProjeto = tituloDoProjeto;
    }

    @Override
    public String toString() {
        return "Modelo{" + "tituloDoProjeto=" + tituloDoProjeto + '}';
    }
    
}
