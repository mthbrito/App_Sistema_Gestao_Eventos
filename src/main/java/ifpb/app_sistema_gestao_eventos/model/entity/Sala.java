package ifpb.app_sistema_gestao_eventos.model.entity;

import jakarta.persistence.*;
import lombok.*;

//@Getter
//@Setter
//@Builder
//@ToString
@Data
@NoArgsConstructor
@Entity
@Table(name="TB_SALA")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 15, unique = true)
    private String nome;

    @Column(nullable = false, precision = 3)
    private int capacidade;

    @Column(nullable = false, length = 50)
    private String localizacao;

    public Sala(String nome, int capacidade, String localizacao) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.localizacao = localizacao;
    }
}
