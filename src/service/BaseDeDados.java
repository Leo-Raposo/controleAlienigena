package service;

import model.Alienigena;
import model.Especie;
import model.Planeta;

import java.time.LocalDateTime;

public class BaseDeDados {
    public static void inicializar(ControleEntrada controle) {
        Planeta dim35C = new Planeta("Dimensão 35-C");

        Especie plumbus = new Especie("Plumbus", dim35C, 3);
        Especie cromulon = new Especie("Cromulon", dim35C, 7);
        Especie gazorpian = new Especie("Gazorpian", dim35C, 8);
        Especie meeseeks = new Especie("Meeseeks", dim35C, 5);
        Especie gromflomite = new Especie("Gromflomite", dim35C, 6);
        Especie zigerion = new Especie("Zigerion", dim35C, 4);
        Especie floopy = new Especie("Floopy", dim35C, 2);
        Especie nub_nub = new Especie("Nub-Nub", dim35C, 1);
        Especie flarg = new Especie("Flarg", dim35C, 9);
        Especie zeep = new Especie("Zeep", dim35C, 5);

        controle.registrarEspecie(plumbus);
        controle.registrarEspecie(cromulon);
        controle.registrarEspecie(gazorpian);
        controle.registrarEspecie(meeseeks);
        controle.registrarEspecie(gromflomite);
        controle.registrarEspecie(zigerion);
        controle.registrarEspecie(floopy);
        controle.registrarEspecie(nub_nub);
        controle.registrarEspecie(flarg);
        controle.registrarEspecie(zeep);

        controle.registrarAlienigena(new Alienigena(1, "Plumbo", plumbus, LocalDateTime.now().minusDays(10)));
        controle.registrarAlienigena(new Alienigena(2, "Cromo", cromulon, LocalDateTime.now().minusDays(20)));
        controle.registrarAlienigena(new Alienigena(3, "Gazorpazorp", gazorpian, LocalDateTime.now().minusDays(30)));
        controle.registrarAlienigena(new Alienigena(4, "Meeseek", meeseeks, LocalDateTime.now().minusDays(40)));
        controle.registrarAlienigena(new Alienigena(5, "Grom", gromflomite, LocalDateTime.now().minusDays(50)));
        controle.registrarAlienigena(new Alienigena(6, "Ziggy", zigerion, LocalDateTime.now().minusDays(60)));
        controle.registrarAlienigena(new Alienigena(7, "Floop", floopy, LocalDateTime.now().minusDays(70)));
        controle.registrarAlienigena(new Alienigena(8, "Nubby", nub_nub, LocalDateTime.now().minusDays(80)));
        controle.registrarAlienigena(new Alienigena(9, "Flargo", flarg, LocalDateTime.now().minusDays(90)));
        controle.registrarAlienigena(new Alienigena(10, "Zeepo", zeep, LocalDateTime.now().minusDays(100)));
    }
}
