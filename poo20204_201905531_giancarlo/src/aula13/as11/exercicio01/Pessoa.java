/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13.as11.exercicio01;

/**
 *
 * @author usuario
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author aluno
 */
public class Pessoa {

    public static void main(String[] args) throws IOException{
    Agenda minha_agenda = new Agenda();
    System.out.println("Minha agenda tem "+minha_agenda.TemQuantos());
    minha_agenda.ArmazenarPessoa("Giancarlo", 22, 1.79f );
    minha_agenda.ArmazenarPessoa("Alisson", 21, 1.84f );
    minha_agenda.ArmazenarPessoa("Matheus", 18, 1.65f );
    minha_agenda.ArmazenarPessoa("Ester", 18, 1.69f );
    minha_agenda.ArmazenarPessoa("Pedro", 18, 1.82f );
    
    FileWriter arq = new FileWriter();
        PrintWriter gravarArq = new PrintWriter(arq);

    System.out.println("Minha agenda tem "+minha_agenda.TemQuantos());
    minha_agenda.ImprimirAgenda();
    System.out.println("Achou Giancarlo ? "+minha_agenda.BuscarPessoa("Giancarlo"));
    System.out.println("Achou Ester ? "+minha_agenda.BuscarPessoa("Ester"));
    if (minha_agenda.RemovePessoa("Pedro")) {
        System.out.println("Conseguiu remover Pedro");
        System.out.println("Minha agenda tem "+minha_agenda.TemQuantos());

    }
    System.out.println("......................................................................");
    minha_agenda.ImprimirAgenda();


      
    
  }
}

