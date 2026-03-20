package ifpb.app_sistema_gestao_eventos.model.entity;

import ifpb.app_sistema_gestao_eventos.model.enums.TipoFuncao;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Usuario {

    private long id;

    private String nome;

    private String email;

    private TipoFuncao funcao;

    private LocalDate dataCadastro;

}
