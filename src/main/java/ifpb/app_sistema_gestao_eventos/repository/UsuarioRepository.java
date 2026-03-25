package ifpb.app_sistema_gestao_eventos.repository;

import ifpb.app_sistema_gestao_eventos.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Override
    Optional<Usuario> findById(Long id);
}
