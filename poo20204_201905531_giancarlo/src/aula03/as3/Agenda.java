/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.as3;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Agenda {
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    public void armazenaPessoa(String nome, int idade, float altura){
        Pessoa p = new Pessoa(nome, idade, altura);
        pessoas.add(p);
    }
    
    public void removePessoa(String nome){
        for (int i = 0; i < pessoas.size(); i++) {
           String aux = pessoas.get(i).getNome();

            if(nome.equals(aux)){
                pessoas.remove(i);
            }
        }
    }
    
    public int buscaPessoa(String nome){
        for (int i = 0; i < pessoas.size(); i++) {
            String aux = pessoas.get(i).getNome();
            
            if(nome.equals(aux)) {
                return i;
            }
        }
        return -1;
    }
    
    public void imprimeAgenda(){
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).imprime());
        }
    }
    
    public void imprimePessoa(int index){
        for (int i = 0; i < pessoas.size(); i++) {
            if(index==i){
                System.out.println(pessoas.get(i).imprime());
            }
        }
    }
}
