package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.entity.Sala;
import ifpb.app_sistema_gestao_eventos.repository.SalaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SalaService {

    private final SalaRepository repository;


    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    public Sala salvarSala(Sala sala) {
        return repository.save(sala);
    }

    public List<Sala> listarTodasSalas() {
        return repository.findAll();
    }

    public Optional<Sala> buscarSalaPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarSala(Long id) {
        repository.deleteById(id);
    }
}
