package view;

import model.Alienigena;
import service.ControleEntrada;

import java.util.List;

public class VerificarDados {
    public static void executar(ControleEntrada controle) {
        List<Alienigena> alienigenas = controle.relatorioEntradas();
        for (Alienigena alien : alienigenas) {
            System.out.println("ID: " + alien.getId());
            System.out.println("Nome: " + alien.getNome());
            System.out.println("Espécie: " + alien.getEspecie().getNome());
            System.out.println("Planeta: " + alien.getEspecie().getPlanetaOrigem().getNome());
            System.out.println("------------------------");
            System.out.println();
        }
    }
}
