package ifpb.app_sistema_gestao_eventos.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name="TB_NOTIFICACAO")
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String mensagem;

    private LocalDateTime dataEnvio;

    private boolean lida;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
