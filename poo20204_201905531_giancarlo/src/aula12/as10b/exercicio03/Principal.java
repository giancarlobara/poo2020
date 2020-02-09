/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.as10b.exercicio03;

/**
 *
 * @author usuario
 */
public class Principal {

    public static void main(String[] args) {
        //observador
        Delegacia delegacia = new Delegacia();
        //observardor
        Companhia companhia = new Companhia();
        //observardo
        SistemaDeAlarme sistemaDeAlarme = new SistemaDeAlarme();
        //adicionar observador ao observado
        sistemaDeAlarme.addObserver(delegacia);
        sistemaDeAlarme.addObserver(companhia);

        sistemaDeAlarme.shopping();
        sistemaDeAlarme.padaria();
        sistemaDeAlarme.banco();
        sistemaDeAlarme.mercado();
        sistemaDeAlarme.joalheria();
        sistemaDeAlarme.acougue();

    }
}
