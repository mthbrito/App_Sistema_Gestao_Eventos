package ifpb.app_sistema_gestao_eventos.model.enums;

import lombok.Getter;

@Getter
public enum StatusInscricao {

    CANCELADA(1),
    CONFIRMADA(2),
    PENDENTE(3);

    private final int valor;

    StatusInscricao(int valor) {
        this.valor = valor;
    }
}
