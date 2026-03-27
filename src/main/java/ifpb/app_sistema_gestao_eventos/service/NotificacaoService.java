package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.entity.Notificacao;
import ifpb.app_sistema_gestao_eventos.repository.NotificacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificacaoService {

    private final NotificacaoRepository repository;

    public NotificacaoService(NotificacaoRepository repository) {
        this.repository = repository;
    }

    public Notificacao salvarNotificacao(Notificacao notificacao) {
        return repository.save(notificacao);
    }

    public List<Notificacao> listarNotificacoes() {
        return repository.findAll();
    }

    public Optional<Notificacao> buscarNotificacaoPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarNotificacao(Long id) {
        repository.deleteById(id);
    }
}
