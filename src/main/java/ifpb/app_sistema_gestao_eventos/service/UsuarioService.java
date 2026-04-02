package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.mapper.UsuarioMapper;
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

    private final UsuarioRepository usuarioRepository;
    private final PerfilRepository perfilRepository;

    public UsuarioService(UsuarioRepository usuarioRepository, PerfilRepository perfilRepository) {
        this.usuarioRepository = usuarioRepository;
        this.perfilRepository = perfilRepository;
    }

    public List<UsuarioResponseDTO> listarUsuarios() {
        return usuarioRepository.findAll()
                .stream()
                .map(UsuarioMapper::toUsuarioResponseDTO)
                .toList();
    }

    public UsuarioResponseDTO buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id)
                .map(UsuarioMapper::toUsuarioResponseDTO)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public UsuarioResponseDTO salvarUsuario(UsuarioRequestDTO usuario) {
        Usuario novoUsuario = toUsuario(usuario);
        List<Perfil> perfis = perfilRepository.findAllById(usuario.perfisIds());
        novoUsuario.setPerfis(perfis);
        usuarioRepository.save(novoUsuario);
        return toUsuarioResponseDTO(novoUsuario);
    }

    public UsuarioResponseDTO atualizarUsuario(Long id, UsuarioRequestDTO usuario) {
        Usuario usuarioAtualizado = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuarioAtualizado.setNome(usuario.nome());
        usuarioAtualizado.setEmail(usuario.email());
        return UsuarioMapper.toUsuarioResponseDTO(usuarioRepository.save(usuarioAtualizado));
    }

    public void deletarUsuario(Long id) {
        if(!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Evento não encontrado");
        }
        usuarioRepository.deleteById(id);
    }
}
