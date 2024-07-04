package application;

import service.AvaliarPericulosidade;
import service.BaseDeDados;
import service.ControleEntrada;
import view.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControleEntrada controle = new ControleEntrada(new AvaliarPericulosidade());
        Scanner scanner = new Scanner(System.in);

        BaseDeDados.inicializar(controle);

        while (true) {
            System.out.println("Sistema de Controle da Dimensão 35-C");
            System.out.println("1. Cadastrar novo Alienígena");
            System.out.println("2. Consultar Alienígenas cadastrados");
            System.out.println("3. Ranking de periculosidade");
            System.out.println("4. Verificar todos planetas, espécies e alienígenas");
            System.out.println("5. Verificar quarentena");
            System.out.println("6. Consultar alienígenas");
            System.out.println("7. Sair");
            System.out.print("Selecione uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    CadastrarNovoAlienigena.executar(controle, scanner);
                    break;
                case 2:
                    ConsultarAlienigenasCadastrados.executar(controle);
                    break;
                case 3:
                    RankingPericulosidade.executar(controle);
                    break;
                case 4:
                    VerificarDados.executar(controle);
                    break;
                case 5:
                    AlienigenasQuarentena.executar(controle);
                    break;
                case 6:
                    ConsultarAlienigenas.executar(controle, scanner);
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
