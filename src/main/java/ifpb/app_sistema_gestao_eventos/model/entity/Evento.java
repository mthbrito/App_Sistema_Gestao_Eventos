package ifpb.app_sistema_gestao_eventos.model.entity;

import ifpb.app_sistema_gestao_eventos.model.enums.TipoEvento;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Evento {

    private long id;

    private String titulo;

    private String descricao;

    private LocalDate dataInicio;

    private LocalDate dataTermino;

    private TipoEvento tipoEvento;

}
