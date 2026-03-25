package ifpb.app_sistema_gestao_eventos.repository;

import ifpb.app_sistema_gestao_eventos.model.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {
}
