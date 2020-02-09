/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12.as10b.exercicio04;

/**
 *
 * @author usuario
 */
public class principal {
    public static void main(String[] args) {
        Processo p = new Processo();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());	
		p.protocolar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.copiar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.colar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
                p.colar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
		p.cancelar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
                p.arquivar();
		System.out.println(p.getEstadoAtual().getClass().getSimpleName());
                p.protocolar();
                System.out.println(p.getEstadoAtual().getClass().getSimpleName());
    }
}
