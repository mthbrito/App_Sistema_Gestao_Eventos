package ifpb.app_sistema_gestao_eventos.model.entity;

import ifpb.app_sistema_gestao_eventos.model.enums.StatusInscricao;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Incricao {

    private long id;

    private LocalDate dataInscricao;

    private StatusInscricao status;

    private boolean presente;

}
