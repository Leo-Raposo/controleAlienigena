package view;

import model.Alienigena;
import service.ControleEntrada;

import java.util.List;

public class ConsultarAlienigenasCadastrados {
    public static void executar(ControleEntrada controle) {
        List<Alienigena> alienigenas = controle.relatorioEntradas();
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio(alienigenas);
    }
}
