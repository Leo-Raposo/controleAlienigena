package view;

import interfaces.RelatorioInterface;
import model.Alienigena;

import java.util.List;

public class Relatorio implements RelatorioInterface {
    @Override
    public void gerarRelatorio(List<Alienigena> alienigenas) {
        for (Alienigena alien : alienigenas) {
            System.out.println("Nome: " + alien.getNome());
            System.out.println("Espécie: " + alien.getEspecie().getNome());
            System.out.println("Planeta: " + alien.getEspecie().getPlanetaOrigem().getNome());
            System.out.println("Nível de Periculosidade: " + alien.getNivelPericulosidade());
            System.out.println("Em Quarentena: " + (alien.isEmQuarentena() ? "Sim" : "Não"));
            System.out.println("------------------------");
            System.out.println();
        }
    }
}
