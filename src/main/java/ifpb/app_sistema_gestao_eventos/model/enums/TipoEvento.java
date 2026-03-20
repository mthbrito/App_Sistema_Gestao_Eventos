package ifpb.app_sistema_gestao_eventos.model.enums;

import lombok.Getter;

@Getter
public enum TipoEvento {

    CURSO(1),
    PALESTRA(2),
    WORKSHOP(3);

    private final int valor;

    TipoEvento(int valor) {
        this.valor = valor;
    }
}
