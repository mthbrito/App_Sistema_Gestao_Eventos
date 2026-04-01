package ifpb.app_sistema_gestao_eventos.model.dto;

import jakarta.validation.constraints.*;

public record InscricaoRequestDTO(
        @NotNull
        Long usuarioId,

        @NotNull
        Long eventoId
) {
}
