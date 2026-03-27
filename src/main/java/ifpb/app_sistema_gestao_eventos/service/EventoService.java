package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.entity.Evento;
import ifpb.app_sistema_gestao_eventos.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EventoService {

    private final EventoRepository repository;


    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }

    public Evento salvarEvento(Evento evento) {
        return repository.save(evento);
    }

    public List<Evento> listarEventos() {
        return repository.findAll();
    }

    public Optional<Evento> buscarEventoPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarEvento(Long id) {
        repository.deleteById(id);
    }
}
