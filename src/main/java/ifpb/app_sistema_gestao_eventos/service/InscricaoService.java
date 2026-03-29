package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.dto.InscricaoRequestDTO;
import ifpb.app_sistema_gestao_eventos.model.dto.InscricaoResponseDTO;
import ifpb.app_sistema_gestao_eventos.model.entity.Evento;
import ifpb.app_sistema_gestao_eventos.model.entity.Inscricao;
import ifpb.app_sistema_gestao_eventos.model.entity.Usuario;
import ifpb.app_sistema_gestao_eventos.repository.EventoRepository;
import ifpb.app_sistema_gestao_eventos.repository.InscricaoRepository;
import ifpb.app_sistema_gestao_eventos.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static ifpb.app_sistema_gestao_eventos.mapper.InscricaoMapper.toInscricaoResponseDTO;

@Service
public class InscricaoService {

    private final InscricaoRepository repository;
    private final UsuarioRepository usuarioRepository;
    private final EventoRepository eventoRepository;

    public InscricaoService(InscricaoRepository repository, UsuarioRepository usuarioRepository, EventoRepository eventoRepository) {
        this.repository = repository;
        this.usuarioRepository = usuarioRepository;
        this.eventoRepository = eventoRepository;
    }

    public InscricaoResponseDTO salvarInscricao(InscricaoRequestDTO inscricao) {
        Usuario usuario = usuarioRepository.findById(inscricao.usuarioId()).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        Evento evento = eventoRepository.findById(inscricao.eventoId()).orElseThrow(() -> new RuntimeException("Evento não encontrado"));
        Inscricao novaInscricao = new Inscricao(usuario, evento);
        repository.save(novaInscricao);
        return toInscricaoResponseDTO(novaInscricao);
    }

    public List<Inscricao> listarInscricoes() {
        return repository.findAll();
    }

    public Optional<Inscricao> buscarInscricaoPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarInscricao(Long id) {
        repository.deleteById(id);
    }
}
