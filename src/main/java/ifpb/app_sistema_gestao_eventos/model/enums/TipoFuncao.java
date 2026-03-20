package ifpb.app_sistema_gestao_eventos.model.enums;

import lombok.Getter;

@Getter
public enum TipoFuncao {

    ALUNO("ALUNO"),
    PROFESSOR("PROFESSOR"),
    SERVIDOR("SERVIDOR");

    private final String valor;

    TipoFuncao(String valor) {
        this.valor = valor;
    }
}
