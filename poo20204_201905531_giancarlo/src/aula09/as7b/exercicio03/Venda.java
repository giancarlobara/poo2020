/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09.as7b.exercicio03;

/**
 *
 * @author usuario
 */
public class Venda {
    private String obraDeArteVendida;
    private String dataDaVenda;
    private Cliente cliente;

    public Venda(String obraDeArteVendida, String dataDaVenda, Cliente cliente) {
        this.obraDeArteVendida = obraDeArteVendida;
        this.dataDaVenda = dataDaVenda;
        this.cliente = cliente;
    }

    public String getObraDeArteVendida() {
        return obraDeArteVendida;
    }

    public void setObraDeArteVendida(String obraDeArteVendida) {
        this.obraDeArteVendida = obraDeArteVendida;
    }

    public String getDataDaVenda() {
        return dataDaVenda;
    }

    public void setDataDaVenda(String dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente.getNome() + "  Obra: " + obraDeArteVendida + "  Vendida em " + dataDaVenda;
    }
    
    
}
