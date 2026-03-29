package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.dto.UsuarioRequestDTO;
import ifpb.app_sistema_gestao_eventos.model.dto.UsuarioResponseDTO;
import ifpb.app_sistema_gestao_eventos.model.entity.Perfil;
import ifpb.app_sistema_gestao_eventos.model.entity.Usuario;
import ifpb.app_sistema_gestao_eventos.repository.PerfilRepository;
import ifpb.app_sistema_gestao_eventos.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static ifpb.app_sistema_gestao_eventos.mapper.UsuarioMapper.toUsuario;
import static ifpb.app_sistema_gestao_eventos.mapper.UsuarioMapper.toUsuarioResponseDTO;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;
    private final PerfilRepository perfilRepository;

    public UsuarioService(UsuarioRepository repository, PerfilRepository perfilRepository) {
        this.repository = repository;
        this.perfilRepository = perfilRepository;
    }

    public UsuarioResponseDTO salvarUsuario(UsuarioRequestDTO usuario) {
        Usuario novoUsuario = toUsuario(usuario);
        List<Perfil> perfis = perfilRepository.findAllById(usuario.perfisIds());
        novoUsuario.setPerfis(perfis);
        repository.save(novoUsuario);
        return toUsuarioResponseDTO(novoUsuario);
    }

    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }

    public Optional<Usuario> buscarUsuarioPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarUsuario(Long id) {
        repository.deleteById(id);
    }
}
