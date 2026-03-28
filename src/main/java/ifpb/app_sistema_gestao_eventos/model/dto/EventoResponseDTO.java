package ifpb.app_sistema_gestao_eventos.model.dto;

import java.time.LocalDateTime;

public record EventoResponseDTO(
        Long id,
        String titulo,
        String descricao,
        LocalDateTime dataInicio,
        LocalDateTime dataTermino,
        String tipoEvento,
        String organizadorNome,
        String salaNome,
        String salaLocalizacao,
        int totalInscricoes
) {
}
