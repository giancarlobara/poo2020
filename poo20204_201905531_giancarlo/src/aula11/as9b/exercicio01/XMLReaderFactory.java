/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.as9b.exercicio01;
// O método no Factory Method não pode ser static, logo troquei para abstract.
/**
 *
 * @author usuario
 */
public abstract class XMLReaderFactory {
    public abstract XMLReader createXMLReader();
}
