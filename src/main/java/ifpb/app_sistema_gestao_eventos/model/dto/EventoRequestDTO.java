package ifpb.app_sistema_gestao_eventos.model.dto;

import ifpb.app_sistema_gestao_eventos.model.enumeration.TipoEvento;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

public record EventoRequestDTO(
        @NotBlank
        String titulo,

        @NotBlank
        String descricao,

        @NotNull
        LocalDateTime dataInicio,

        @NotNull
        LocalDateTime dataTermino,

        @NotBlank
        String tipoEvento,

        @NotNull
        Long organizadorId,

        @NotNull
        Long salaId
) {
}
