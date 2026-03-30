package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.mapper.EventoMapper;
import ifpb.app_sistema_gestao_eventos.model.dto.EventoRequestDTO;
import ifpb.app_sistema_gestao_eventos.model.dto.EventoResponseDTO;
import ifpb.app_sistema_gestao_eventos.model.entity.Evento;
import ifpb.app_sistema_gestao_eventos.repository.EventoRepository;
import ifpb.app_sistema_gestao_eventos.repository.SalaRepository;
import ifpb.app_sistema_gestao_eventos.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static ifpb.app_sistema_gestao_eventos.mapper.EventoMapper.toEvento;
import static ifpb.app_sistema_gestao_eventos.mapper.EventoMapper.toEventoResponseDTO;


@Service
public class EventoService {

    private final EventoRepository repository;
    private final UsuarioRepository usuarioRepository;
    private final SalaRepository salaRepository;


    public EventoService(EventoRepository repository, UsuarioRepository usuarioRepository, SalaRepository salaRepository) {
        this.repository = repository;
        this.usuarioRepository = usuarioRepository;
        this.salaRepository = salaRepository;
    }

    public EventoResponseDTO salvarEvento(EventoRequestDTO evento) {
        Evento novoEvento = toEvento(evento);
        novoEvento.setOrganizador(usuarioRepository.findById(evento.organizadorId()).orElseThrow(() -> new RuntimeException("Usuário não encontrado")));
        novoEvento.setSala(salaRepository.findById(evento.salaId()).orElseThrow(() -> new RuntimeException("Sala não encontrada")));
        repository.save(novoEvento);
        return toEventoResponseDTO(novoEvento);
    }

    public List<EventoResponseDTO> listarEventos() {
        return repository.findAll()
                .stream()
                .map(EventoMapper::toEventoResponseDTO)
                .toList();
    }

    public Optional<EventoResponseDTO> buscarEventoPorId(Long id) {
        return repository.findById(id)
                .map(EventoMapper::toEventoResponseDTO);
    }

    public void deletarEvento(Long id) {
        repository.deleteById(id);
    }
}
