package service;

import interfaces.Consulta;
import interfaces.Periculosidade;
import interfaces.Registro;
import model.Alienigena;
import model.Especie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ControleEntrada implements Registro, Consulta {
    private List<Alienigena> alienigenas;
    private List<Especie> especies;
    private Periculosidade avaliador;

    public ControleEntrada(Periculosidade avaliador) {
        this.alienigenas = new ArrayList<>();
        this.especies = new ArrayList<>();
        this.avaliador = avaliador;
    }

    @Override
    public void registrarEspecie(Especie especie) {
        especies.add(especie);
    }

    @Override
    public void registrarAlienigena(Alienigena alienigena) {
        int nivelPericulosidade = avaliador.avaliarPericulosidade(alienigena);
        alienigena.setNivelPericulosidade(nivelPericulosidade);
        if (nivelPericulosidade > 5) {
            alienigena.setEmQuarentena(true);
        }
        alienigenas.add(alienigena);
    }

    public List<Alienigena> relatorioEntradas() {
        return new ArrayList<>(alienigenas);
    }

    @Override
    public List<Alienigena> getAlienigenasPorEspecie(String nomeEspecie) {
        return alienigenas.stream()
                .filter(alien -> alien.getEspecie().getNome().equalsIgnoreCase(nomeEspecie))
                .collect(Collectors.toList());
    }

    @Override
    public List<Alienigena> getAlienigenasEntradosApos(LocalDateTime data) {
        return alienigenas.stream()
                .filter(alien -> alien.getDataHoraEntrada().isAfter(data))
                .collect(Collectors.toList());
    }

    public Especie getEspeciePorNome(String nome) {
        for (Especie especie : especies) {
            if (especie.getNome().equalsIgnoreCase(nome)) {
                return especie;
            }
        }
        return null;
    }

    public List<Especie> getEspecies() {
        return new ArrayList<>(especies);
    }
}
