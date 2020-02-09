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
public class Aplicacao {

    public static void main(String[] args) {
        Logger log1 = Logger.getInstancia();
        log1.setAtivo(true);
        log1.log("PRIMEIRA MENSAGEM DE LOG");
        Logger log2 = Logger.getInstancia();
        log2.log("SEGUNDA MENSAGEM DE LOG");
    }
}
