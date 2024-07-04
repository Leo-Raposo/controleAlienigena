package view;

import model.Alienigena;
import service.ControleEntrada;

import java.util.List;

public class RankingPericulosidade {
    public static void executar(ControleEntrada controle) {
        List<Alienigena> alienigenas = controle.relatorioEntradas();
        alienigenas.sort((a1, a2) -> Integer.compare(a2.getNivelPericulosidade(), a1.getNivelPericulosidade()));
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio(alienigenas);
    }
}
