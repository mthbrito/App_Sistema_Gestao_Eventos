package ifpb.app_sistema_gestao_eventos.repository;

import ifpb.app_sistema_gestao_eventos.model.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
