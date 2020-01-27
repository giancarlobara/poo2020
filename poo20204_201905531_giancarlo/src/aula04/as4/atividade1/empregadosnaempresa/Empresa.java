/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4.atividade1.empregadosnaempresa;

import aula04.as4.atividade1.enderecodeclientes.Endereco;

/**
 *
 * @author usuario
 */
public class Empresa {
    private String cnpj;
    private String razao;
    private Endereco endereco;

    public Empresa(String cnpj, String razao, Endereco endereco) {
        this.cnpj = cnpj;
        this.razao = razao;
        this.endereco = endereco;
        
        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
