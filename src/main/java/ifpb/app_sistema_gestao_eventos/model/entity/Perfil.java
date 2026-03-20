package ifpb.app_sistema_gestao_eventos.model.entity;

import ifpb.app_sistema_gestao_eventos.model.enums.TipoPerfil;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Perfil {

    private long id;

    private TipoPerfil nome;

}
