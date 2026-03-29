package ifpb.app_sistema_gestao_eventos.model.dto;

import ifpb.app_sistema_gestao_eventos.model.enumeration.StatusInscricao;

import java.time.LocalDate;

public record InscricaoResponseDTO(
        Long id,
        LocalDate dataInscricao,
        StatusInscricao status,
        boolean presente,
        String usuarioNome,
        String eventoNome
) {
}
