
package aula03.as3;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private float altura;
    private int idade;
    
    Pessoa(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
     
    public String imprime(){
        return "Nome: " + nome + " - Idade: " + idade + " - Altura: " + altura + "\n";
        
    }
}
