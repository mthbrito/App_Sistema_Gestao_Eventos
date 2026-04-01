package ifpb.app_sistema_gestao_eventos.service;

import ifpb.app_sistema_gestao_eventos.mapper.PerfilMapper;
import ifpb.app_sistema_gestao_eventos.model.dto.PerfilRequestDTO;
import ifpb.app_sistema_gestao_eventos.model.dto.PerfilResponseDTO;
import ifpb.app_sistema_gestao_eventos.model.entity.Perfil;
import ifpb.app_sistema_gestao_eventos.repository.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static ifpb.app_sistema_gestao_eventos.mapper.PerfilMapper.toPerfil;
import static ifpb.app_sistema_gestao_eventos.mapper.PerfilMapper.toPerfilResponseDTO;

@Service
public class PerfilService {

    private final PerfilRepository repository;

    public PerfilService(PerfilRepository repository) {
        this.repository = repository;
    }

    public PerfilResponseDTO salvarPerfil(PerfilRequestDTO perfil) {
        Perfil novoPerfil = toPerfil(perfil);
        repository.save(novoPerfil);
        return toPerfilResponseDTO(novoPerfil);
    }

    public List<Perfil> listarPerfis() {
        return repository.findAll();
    }

    public Optional<Perfil> buscarPerfilPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarPerfil(Long id) {
        repository.deleteById(id);
    }

    public PerfilResponseDTO atualizarPerfil(Long id, PerfilRequestDTO dto) {

        Perfil perfil = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Perfil não encontrado"));

        perfil.setNome(dto.nome());

        return PerfilMapper.toPerfilResponseDTO(repository.save(perfil));
    }
}
