package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.entity.Usuario;
import ifpb.app_sistema_gestao_eventos.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;


    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> listarTodosUsuarios() {
        return repository.findAll();
    }

    public Optional<Usuario> buscarUsuarioPorId(Long id) {
        return repository.findById(id);
    }

    public void deletartUsuario(Long id) {
        repository.deleteById(id);
    }
}
