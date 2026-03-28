package ifpb.app_sistema_gestao_eventos.model.dto;

public record SalaResponseDTO(
        Long id,
        String nome,
        int capacidade,
        String localizacao
) {
}
