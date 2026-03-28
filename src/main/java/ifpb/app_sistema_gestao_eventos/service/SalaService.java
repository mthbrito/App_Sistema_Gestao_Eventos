package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.dto.SalaRequestDTO;
import ifpb.app_sistema_gestao_eventos.model.entity.Sala;
import ifpb.app_sistema_gestao_eventos.repository.SalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaService {

    private final SalaRepository repository;

    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    /*public Sala salvarSala(SalaRequestDTO sala) {
        Sala novaSala = new Sala();
        novaSala.setNome(sala.nome());
        novaSala.setCapacidade(sala.capacidade());
        novaSala.setLocalizacao(sala.localizacao());
        return repository.save(novaSala);
    }*/

    public List<Sala> listarSalas() {
        return repository.findAll();
    }

    public Optional<Sala> buscarSalaPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarSala(Long id) {
        repository.deleteById(id);
    }
}
