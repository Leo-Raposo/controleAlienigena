package interfaces;

import model.Alienigena;

import java.time.LocalDateTime;
import java.util.List;

public interface Consulta {
    List<Alienigena> getAlienigenasPorEspecie(String nomeEspecie);
    List<Alienigena> getAlienigenasEntradosApos(LocalDateTime data);
}
