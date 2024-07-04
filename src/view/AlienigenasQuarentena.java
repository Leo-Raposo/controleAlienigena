package view;

import model.Alienigena;
import service.ControleEntrada;

import java.util.List;

public class AlienigenasQuarentena {
    public static void executar(ControleEntrada controle) {
        List<Alienigena> alienigenas = controle.relatorioEntradas();
        for (Alienigena alien : alienigenas) {
            if (alien.isEmQuarentena()) {
                System.out.println("Nome: " + alien.getNome());
                System.out.println("Espécie: " + alien.getEspecie().getNome());
                System.out.println("Nível de Periculosidade: " + alien.getNivelPericulosidade());
                System.out.println("Em Quarentena: Sim");
                System.out.println("------------------------");
                System.out.println();
            }
        }
    }
}
