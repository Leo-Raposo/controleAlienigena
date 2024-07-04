package service;

import interfaces.Periculosidade;
import model.Alienigena;

public class AvaliarPericulosidade implements Periculosidade {
    @Override
    public int avaliarPericulosidade(Alienigena alienigena) {
        int nivelBase = alienigena.getEspecie().getNivelPericulosidadeBase();
        return nivelBase;
    }
}
