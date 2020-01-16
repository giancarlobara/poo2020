/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturada;

/**
 *
 * @author aluno
 */
public class CalculaNota 
{
    public static void main(String[] args) 
    {
       String nomeAluno1= "Elias";
       double nota1Aluno1= 0.9;
       double nota2Aluno1=0.6;
       double nota3Aluno1=3.5;
       
       String nomeAluno2= "Edmarcelo";
       double nota1Aluno2= 0.4;
       double nota2Aluno2=2.6;
       double nota3Aluno2=1.5;
       
       String nomeAluno3= "Giancarlo";
       double nota1Aluno3= 9.9;
       double nota2Aluno3=8.8;
       double nota3Aluno3=9.3;
       
       String nomeAluno4= "Gustavo";
       double nota1Aluno4= 1.2;
       double nota2Aluno4=2.9;
       double nota3Aluno4=3.5;
       
       double mediaAluno1 = (nota1Aluno1 + nota2Aluno1 + nota3Aluno1)/3;
       double mediaAluno2 = (nota1Aluno2 + nota2Aluno2 + nota3Aluno2)/3;        
       double mediaAluno3 = (nota1Aluno3 + nota2Aluno3 + nota3Aluno3)/3;
       double mediaAluno4 = (nota1Aluno4 + nota2Aluno4 + nota3Aluno4)/3;
       
       double mediaGeral = (mediaAluno1 + mediaAluno2 + mediaAluno3 + mediaAluno4)/4;
       
        System.out.println("Média de " mediaAluno1);
       
    } 
}
