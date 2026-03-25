package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.model.entity.Perfil;
import ifpb.app_sistema_gestao_eventos.repository.PerfilRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PerfilService {

    private final PerfilRepository repository;


    public PerfilService(PerfilRepository repository) {
        this.repository = repository;
    }

    public Perfil salvarPerfil(Perfil perfil) {
        return repository.save(perfil);
    }

    public List<Perfil> listarTodosPerfis() {
        return repository.findAll();
    }

    public Optional<Perfil> buscarPerfilPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarPerfil(Long id) {
        repository.deleteById(id);
    }
}
