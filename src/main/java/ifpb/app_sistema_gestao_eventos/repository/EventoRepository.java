package ifpb.app_sistema_gestao_eventos.repository;

import ifpb.app_sistema_gestao_eventos.model.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
