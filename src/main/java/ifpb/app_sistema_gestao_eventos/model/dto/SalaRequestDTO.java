package ifpb.app_sistema_gestao_eventos.model.dto;

import jakarta.validation.constraints.*;

public record SalaRequestDTO(
        @NotBlank
        String nome,

        @Min(1)
        int capacidade,

        @NotBlank
        String localizacao
) {
}
