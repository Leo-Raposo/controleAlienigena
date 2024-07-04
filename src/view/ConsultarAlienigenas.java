package view;

import model.Alienigena;
import model.Especie;
import service.ControleEntrada;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class ConsultarAlienigenas {
    public static void executar(ControleEntrada controle, Scanner scanner) {
        Relatorio relatorio = new Relatorio();
        while (true) {
            System.out.println("Consultas disponíveis:");
            System.out.println("1. Mostrar todos os alienígenas de uma espécie específica");
            System.out.println("2. Mostrar todos os alienígenas que entraram no planeta nos últimos 6 meses");
            System.out.println("3. Voltar ao menu principal");
            System.out.println("4. Sair do sistema");
            System.out.print("Selecione uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    mostrarAlienigenasPorEspecie(controle, scanner, relatorio);
                    break;
                case 2:
                    LocalDateTime seisMesesAtras = LocalDateTime.now().minusMonths(6);
                    List<Alienigena> alienigenasRecentes = controle.getAlienigenasEntradosApos(seisMesesAtras);
                    relatorio.gerarRelatorio(alienigenasRecentes);
                    break;
                case 3:
                    return;
                case 4:
                    System.out.println("Encerrando o programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void mostrarAlienigenasPorEspecie(ControleEntrada controle, Scanner scanner, Relatorio relatorio) {
        while (true) {
            List<Especie> especies = controle.getEspecies();
            System.out.println("Espécies disponíveis:");
            for (int i = 0; i < especies.size(); i++) {
                System.out.println((i + 1) + ". " + especies.get(i).getNome());
            }
            System.out.println((especies.size() + 1) + ". Voltar ao menu anterior");
            System.out.print("Selecione uma espécie pelo número: ");
            int indiceEspecie = scanner.nextInt() - 1;
            scanner.nextLine();

            if (indiceEspecie >= 0 && indiceEspecie < especies.size()) {
                String nomeEspecie = especies.get(indiceEspecie).getNome();
                List<Alienigena> alienigenasEspecie = controle.getAlienigenasPorEspecie(nomeEspecie);
                relatorio.gerarRelatorio(alienigenasEspecie);
            } else if (indiceEspecie == especies.size()) {
                return;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
