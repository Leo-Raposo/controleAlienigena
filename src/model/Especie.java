package model;

public class Especie {
    private String nome;
    private Planeta planetaOrigem;
    private int nivelPericulosidadeBase;

    public Especie(String nome, Planeta planetaOrigem, int nivelPericulosidadeBase) {
        this.nome = nome;
        this.planetaOrigem = planetaOrigem;
        this.nivelPericulosidadeBase = nivelPericulosidadeBase;
    }


    public String getNome() {
        return nome;
    }
    public Planeta getPlanetaOrigem() {
        return planetaOrigem;
    }
    public int getNivelPericulosidadeBase() {
        return nivelPericulosidadeBase;
    }
}
