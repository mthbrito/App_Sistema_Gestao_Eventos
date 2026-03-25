package ifpb.app_sistema_gestao_eventos.repository;

import ifpb.app_sistema_gestao_eventos.model.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepository extends JpaRepository<Sala, Long> {
}
