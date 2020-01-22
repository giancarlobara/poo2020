/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as1;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Quatro {
    public static void main(String[] args) 
    {
        String nome;
        String telefone;
        
        nome = JOptionPane.showInputDialog("Informar nome:");
        telefone = JOptionPane.showInputDialog("Informar o número de telefone:");
        
        if(!ValidaNome(nome))
        {
            JOptionPane.showMessageDialog(null, "Nome digitado inválido", "Algo deu errado", JOptionPane.ERROR_MESSAGE);
        }
               
        if(!ValidaTelefone(telefone))
        {
            JOptionPane.showMessageDialog(null, "Numero de telefone inválido", "Algo deu errado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static boolean ValidaNome(String nome)
    {
        for(int i = 0 ; i < nome.length() ; i++ )
        {
            if(Character.isDigit(nome.charAt(i)))
            {
               return false; 
            }
        }
        return true;
    }
    
    
    public static boolean ValidaTelefone(String telefone)
    {
        for(int i = 0 ; i < telefone.length() ; i++ )
        {
            if(!Character.isDigit(telefone.charAt(i)))
            {
               return false; 
            }
        }
        return true;
    }
    
    
}
