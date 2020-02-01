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
public abstract class Veiculo implements Modelo {

    private int placa;
    private Empregado responsavel;

    public Veiculo(int placa, Empregado responsavel) {
        this.placa = placa;
        this.responsavel = responsavel;

    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public Empregado getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Empregado responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", responsavel=" + responsavel + '}';
    }
    public void imprimir() {
    }
}
