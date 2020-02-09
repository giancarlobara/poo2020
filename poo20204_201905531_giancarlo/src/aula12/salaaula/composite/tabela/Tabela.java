package aula12.salaaula.composite.tabela;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gilmario on 08/06/16.
 */
public class Tabela {
    private List<Linha> linhas = new ArrayList<Linha>();
    public void adicionar(Linha l) {
        linhas.add(l);
    }
}
