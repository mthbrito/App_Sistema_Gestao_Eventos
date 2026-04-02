package ifpb.app_sistema_gestao_eventos.model.dto;

import java.time.LocalDate;

public record NotificacaoResponseDTO(
        Long id,
        String mensagem,
        LocalDate dataEnvio,
        boolean lida,
        String usuarioNome
) {
}
