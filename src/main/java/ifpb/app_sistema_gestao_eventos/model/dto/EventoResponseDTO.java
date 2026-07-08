package ifpb.app_sistema_gestao_eventos.model.dto;

import ifpb.app_sistema_gestao_eventos.model.enumeration.TipoEvento;

import java.time.LocalDateTime;

public record EventoResponseDTO(
        Long id,
        String titulo,
        String descricao,
        LocalDateTime dataInicio,
        LocalDateTime dataTermino,
        TipoEvento tipoEvento,
        Long organizadorId,
        String organizadorNome,
        Long salaId,
        String salaNome,
        String salaLocalizacao,
        int totalInscricoes
) {}