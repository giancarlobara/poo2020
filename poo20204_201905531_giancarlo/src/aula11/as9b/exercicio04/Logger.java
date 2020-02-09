/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.as9b.exercicio04;

/**
 *
 * @author usuario
 */
public class Logger {
    
    public static Logger instancia;
    private boolean ativo = false;

    private Logger() {
    }

    public boolean isAtivo() {
        return this.ativo;
    }
    
    public static Logger getInstancia(){
        if(instancia == null ) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void setAtivo(boolean b) {
        this.ativo = b;
    }

    public void log(String s) {
        if (this.ativo) {
            System.out.println("LOG :: " + s);
        }

    }
}
