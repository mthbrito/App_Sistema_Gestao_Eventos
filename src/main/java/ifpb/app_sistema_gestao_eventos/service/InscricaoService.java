package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.entity.Inscricao;
import ifpb.app_sistema_gestao_eventos.repository.InscricaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InscricaoService {

    private final InscricaoRepository repository;


    public InscricaoService(InscricaoRepository repository) {
        this.repository = repository;
    }

    public Inscricao  salvarInscricao(Inscricao inscricao) {
        return repository.save(inscricao);
    }

    public List<Inscricao> listarTodasInscricoes() {
        return repository.findAll();
    }

    public Optional<Inscricao> buscarInscricaoPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarInscricao(Long id) {
        repository.deleteById(id);
    }
}
