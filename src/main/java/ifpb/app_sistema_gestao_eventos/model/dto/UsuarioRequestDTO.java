package ifpb.app_sistema_gestao_eventos.model.dto;

import ifpb.app_sistema_gestao_eventos.model.enumeration.TipoFuncao;

public record UsuarioRequestDTO(
    String nome,
    String email,
    String senha,
    TipoFuncao funcao
) {
}
