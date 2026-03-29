package ifpb.app_sistema_gestao_eventos.model.dto;

import ifpb.app_sistema_gestao_eventos.model.enumeration.TipoFuncao;

import java.util.List;

public record UsuarioRequestDTO(
    String nome,
    String email,
    String senha,
    TipoFuncao funcao,
    List<Long> perfisIds
) {
}
