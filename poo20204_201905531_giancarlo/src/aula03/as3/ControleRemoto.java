/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.as3;

/**
 *
 * @author usuario
 */
public class ControleRemoto {
    Televisao t = new Televisao();
    public void aumentarVolume() {
        if(t.getVolume()<100){
            t.setVolume(t.getVolume()+1);
        }
    } 
    public void diminuirVolume() {
        if(t.getVolume()>0){
            t.setVolume(t.getVolume()-1);
        }
    }
    public void aumentarCanal() {
        t.setCanal(t.getCanal()+1);
       
    } 
    public void diminuirCanal() {
        if(t.getCanal()>0){
            t.setCanal(t.getCanal()-1);
        }
    }
    
    public void trocar(int canal){
        if(canal>0){
            t.setCanal(canal);
        }
    }
    
    public void consulta(){
        System.out.println("Volume: " + t.getVolume() +  "\n Canal: " + t.getCanal());
    }
}
