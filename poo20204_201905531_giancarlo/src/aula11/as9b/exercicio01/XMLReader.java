/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.as9b.exercicio01;

import java.io.InputStream;
import java.net.ContentHandler;

/**
 *
 * @author usuario
 */
public interface XMLReader {
    public void setContentHandler(ContentHandler handler);
    public void parse(InputStream is);
}
