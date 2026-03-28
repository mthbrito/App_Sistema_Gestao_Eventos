package ifpb.app_sistema_gestao_eventos.model.dto;

import java.time.LocalDateTime;

public record InscricaoResponseDTO(
        Long id,
        LocalDateTime dataInscricao,
        String status,
        boolean presente,
        String usuarioNome,
        String eventoNome
) {
}
