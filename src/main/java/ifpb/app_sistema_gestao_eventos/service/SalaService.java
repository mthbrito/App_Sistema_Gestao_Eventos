package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.mapper.SalaMapper;
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

    public List<SalaResponseDTO> listarSalas() {
        return repository.findAll()
                .stream()
                .map(SalaMapper::toSalaResponseDTO)
                .toList();
    }

    public Optional<SalaResponseDTO> buscarSalaPorId(Long id) {
        return repository.findById(id)
                .map(SalaMapper::toSalaResponseDTO);
    }

    public SalaResponseDTO salvarSala(SalaRequestDTO sala) {
        Sala novaSala = toSala(sala);
        repository.save(novaSala);
        return toSalaResponseDTO(novaSala);
    }

    public SalaResponseDTO atualizarSala(Long id, SalaRequestDTO dto) {
        Sala sala = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sala não encontrada"));
        sala.setNome(dto.nome());
        sala.setCapacidade(dto.capacidade());
        sala.setLocalizacao(dto.localizacao());
        return SalaMapper.toSalaResponseDTO(repository.save(sala));
    }

    public void deletarSala(Long id) {
        repository.deleteById(id);
    }

}
