package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.dto.SalaRequestDTO;
import ifpb.app_sistema_gestao_eventos.model.dto.SalaResponseDTO;
import ifpb.app_sistema_gestao_eventos.model.entity.Sala;
import ifpb.app_sistema_gestao_eventos.repository.SalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static ifpb.app_sistema_gestao_eventos.mapper.SalaMapper.toSala;
import static ifpb.app_sistema_gestao_eventos.mapper.SalaMapper.toSalaResponseDTO;

@Service
public class SalaService {

    private final SalaRepository repository;

    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    public SalaResponseDTO salvarSala(SalaRequestDTO sala) {
        Sala novaSala = toSala(sala);
        repository.save(novaSala);
        return toSalaResponseDTO(novaSala);
    }

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
