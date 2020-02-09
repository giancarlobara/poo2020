package aula14.salaaula.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import aula03.as3b.exercicio02.Agenda;
import aula03.as3b.exercicio02.Pessoa;

public class TestaAgenda {

	Agenda agenda;
	
	@Before
	public void setup() {
		agenda = new Agenda();
	}
	
	@Test
	public void testaAdicaoPessoaAgenda() {
		agenda.adicionaPessoa("Antonio Carlos", 35, 1.75f);
        agenda.adicionaPessoa("Pedro Paulo", 18, 1.65f);
        agenda.adicionaPessoa("Jorley da Cambalhota", 32, 1.85f);
        assertTrue(agenda.getListaPessoas().size() == 3);
	}
	
	@Test
	public void testaRemocaoPorNome() {
		agenda.adicionaPessoa("Antonio Carlos", 35, 1.75f);
        agenda.adicionaPessoa("Pedro Paulo", 18, 1.65f);
        agenda.adicionaPessoa("Jorley da Cambalhota", 32, 1.85f);
        agenda.removePessoa("Pedro Paulo");
        assertTrue(agenda.getListaPessoas().size() == 2);
	}
	
	@Test
	public void testaRemocaoPessoaObjeto() {
		Pessoa p1 = new Pessoa("Antonio Carlos", 35, 1.75f);
		agenda.adicionaPessoa(p1);
		Pessoa p2 = new Pessoa("Pedro Paulo", 18, 1.65f);
        agenda.adicionaPessoa(p2);
        Pessoa p3 = new Pessoa("Jorley da Cambalhota", 32, 1.85f);
        agenda.adicionaPessoa(p3);
        agenda.removePessoa(p1);
        assertTrue(agenda.getListaPessoas().size() == 2);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testaRemocaoPorIndice() {
		agenda.adicionaPessoa("Antonio Carlos", 35, 1.75f);
        agenda.adicionaPessoa("Pedro Paulo", 18, 1.65f);
        agenda.adicionaPessoa("Jorley da Cambalhota", 32, 1.85f);
        agenda.removePessoa(3);
        assertTrue(agenda.getListaPessoas().size() == 2);
	}
	
	@Test
	public void testaRemocaoPorIndice2() {
		agenda.adicionaPessoa("Antonio Carlos", 35, 1.75f);
        agenda.adicionaPessoa("Pedro Paulo", 18, 1.65f);
        agenda.adicionaPessoa("Jorley da Cambalhota", 32, 1.85f);
        agenda.removePessoa(2);
        assertTrue(agenda.getListaPessoas().size() == 2);
	}
	
	@Test
	public void testaConsulta() {
		agenda.adicionaPessoa("Antonio Carlos", 35, 1.75f);
        agenda.adicionaPessoa("Pedro Paulo", 18, 1.65f);
        agenda.adicionaPessoa("Jorley da Cambalhota", 32, 1.85f);
        
        Pessoa p = agenda.getListaPessoas().get(2);
        
        assertTrue(p.getIdade() == 32);
	}
	
}
