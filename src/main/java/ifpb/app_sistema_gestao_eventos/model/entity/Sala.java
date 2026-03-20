package ifpb.app_sistema_gestao_eventos.model.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Sala {

    private long id;

    private String nome;

    private int capacidade;

    private String localizacao;

}
