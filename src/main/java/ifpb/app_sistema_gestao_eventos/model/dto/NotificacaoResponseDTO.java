package ifpb.app_sistema_gestao_eventos.model.dto;

import java.time.LocalDateTime;

public record NotificacaoResponseDTO(
        Long id,
        String mensagem,
        LocalDateTime dataEnvio,
        boolean lida,
        String usuarioNome
) {
}
