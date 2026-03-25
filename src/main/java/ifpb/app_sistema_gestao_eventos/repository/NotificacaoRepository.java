package ifpb.app_sistema_gestao_eventos.repository;

import ifpb.app_sistema_gestao_eventos.model.entity.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {
}
