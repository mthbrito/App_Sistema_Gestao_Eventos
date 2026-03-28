package ifpb.app_sistema_gestao_eventos.model.dto;

import java.time.LocalDateTime;

public record EventoRequestDTO(
        String titulo,
        String descricao,
        LocalDateTime dataInicio,
        LocalDateTime dataTermino,
        String tipoEvento,
        Long organizadorId,
        Long salaId
) {
}
