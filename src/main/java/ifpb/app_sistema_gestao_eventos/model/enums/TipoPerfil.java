package ifpb.app_sistema_gestao_eventos.model.enums;

import lombok.Getter;


@Getter
public enum TipoPerfil {

    ADIMIN("ADIMIN"),
    USER("USER");

    private final String valor;

    TipoPerfil(String valor) {
        this.valor = valor;
    }
}
