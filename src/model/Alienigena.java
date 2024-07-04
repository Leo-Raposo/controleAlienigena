package model;

import java.time.LocalDateTime;

public class Alienigena {
    private int id;
    private String nome;
    private Especie especie;
    private int nivelPericulosidade;
    private LocalDateTime dataHoraEntrada;
    private boolean emQuarentena;

    public Alienigena(int id, String nome, Especie especie, LocalDateTime dataHoraEntrada) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.dataHoraEntrada = dataHoraEntrada;
        this.nivelPericulosidade = especie.getNivelPericulosidadeBase();
        this.emQuarentena = false;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public Especie getEspecie() {
        return especie;
    }
    public int getNivelPericulosidade() {
        return nivelPericulosidade;
    }
    public void setNivelPericulosidade(int nivelPericulosidade) {
        this.nivelPericulosidade = nivelPericulosidade;
    }
    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }
    public boolean isEmQuarentena() {
        return emQuarentena;
    }
    public void setEmQuarentena(boolean emQuarentena) {
        this.emQuarentena = emQuarentena;
    }
}
