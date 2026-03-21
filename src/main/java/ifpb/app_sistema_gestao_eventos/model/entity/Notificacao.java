package ifpb.app_sistema_gestao_eventos.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="TB_NOTIFICACAO")
public class Notificacao {
    //IMPLEMENTAR SEGUINDO EXEMPLO DAS DEMAIS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
}
