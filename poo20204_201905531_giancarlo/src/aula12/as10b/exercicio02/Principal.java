/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.as10b.exercicio02;

/**
 *
 * @author usuario
 */
public class Principal {
    public static void main(String[] args) {
        Arquivo a1 = new Arquivo("lol launcher.patch", "1254");
        Arquivo a2 = new Arquivo("Bruna Surfistinha, A volta.vma", "4203");
        Arquivo a3 = new Arquivo("R Potter e o cálice de fogo.vma", "132514");
        Arquivo a4 = new Arquivo("Era um garoto que como eu.mp3", "7099");

        Pasta novaPasta = new Pasta("POO 20204");
        novaPasta.adicionaArquivo(a1);
        novaPasta.adicionaArquivo(a2);
        novaPasta.adicionaArquivo(a3);
        novaPasta.adicionaArquivo(a4);
        
        System.out.println("Pasta " + novaPasta.getNome());
        for (Arquivo arquivo : novaPasta.getListaArquivos()) {
            System.out.println(arquivo.getNome() + " - " + arquivo.getTamanho() + "KBs");
        }

    }
}
