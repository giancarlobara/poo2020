/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.as10b.exercicio03;

import java.util.Observable;

/**
 *
 * @author usuario
 */
public class SistemaDeAlarme extends Observable implements Seguranca {

    private String disparou = "";

    public void shopping() {
        disparou = "shopping";
        System.out.println("Assalto no Shopping.");
        this.local();
    }

    public void acougue() {
        disparou = "acougue";
        System.out.println("Vitória rouba carne pro churrasco.");
        this.local();
    }

    public void joalheria() {
        disparou = "joalheria";
        System.out.println("Assalto na joalheria.");
        this.local();
    }

    public void mercado() {
        disparou = "mercado";
        System.out.println("Assalto no Mercadim.");
        this.local();
    }

    public void padaria() {
        disparou = "padaria";
        System.out.println("Vitoria rouba cacetim na padaria.");
        this.local();
    }

    public void banco() {
        disparou = "banco";
        System.out.println("Assalto no Banco.");
        this.local();
    }

    public void local() {
        setChanged();//mudou estado
        notifyObservers(disparou);//notifica os observadores
    }
}
