/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.as10b.exercicio03;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author usuario
 */
public class Companhia implements Observer, Seguranca {

    @Override
    public void shopping() {
        System.out.println("Companhia de seguros é notificada de assalto no shopping.");
    }

    @Override
    public void acougue() {
        System.out.println("Companhia de seguros é notificada de assalto no açougue enquanto Vitória foge com picanha.");
    }

    @Override
    public void joalheria() {
        System.out.println("Companhia de seguros é notificada de assalto na joalheria.");
    }

    @Override
    public void mercado() {
        System.out.println("Companhia de seguros é notificada de assalto no mercado.");
    }

    @Override
    public void padaria() {
        System.out.println("Companhia de seguros é notificada de assalto na padaria, enquanto bandida diz:15 taokeis no cacetinho não da.");
    }

    @Override
    public void banco() {
        System.out.println("Companhia de seguros é notificada de assalto no Banco e pedem para abaixar seus juros.");
    }

    @Override
    public void update(Observable o, Object arg1) {
        SistemaDeAlarme alarme = (SistemaDeAlarme) o;
        String disparou = String.valueOf(arg1);

        if (disparou.equals("shopping")) {
            this.shopping();
        }
        if (disparou.equals("acougue")) {
            this.acougue();
        }
        if (disparou.equals("joalheria")) {
            this.joalheria();
        }
        if (disparou.equals("mercado")) {
            this.mercado();
        }
        if (disparou.equals("padaria")) {
            this.padaria();
        }
        if (disparou.equals("Banco")) {
            this.banco();
        }

    }

}
