package view;

import model.Alienigena;
import model.Especie;
import model.Planeta;
import service.ControleEntrada;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CadastrarNovoAlienigena {
    public static void executar(ControleEntrada controle, Scanner scanner) {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Espécie: ");
        String nomeEspecie = scanner.nextLine();
        Especie especie = controle.getEspeciePorNome(nomeEspecie);
        if (especie == null) {
            System.out.print("Planeta: ");
            String nomePlaneta = scanner.nextLine();
            System.out.print("Nível de periculosidade: ");
            int nivelBase = scanner.nextInt();
            scanner.nextLine();
            Planeta planeta = new Planeta(nomePlaneta);
            especie = new Especie(nomeEspecie, planeta, nivelBase);
            controle.registrarEspecie(especie);
        }
        LocalDateTime dataHoraEntrada = LocalDateTime.now();
        Alienigena alienigena = new Alienigena(id, nome, especie, dataHoraEntrada);
        controle.registrarAlienigena(alienigena);
        System.out.println("Alienígena cadastrado com sucesso!");
        System.out.println();
    }
}
