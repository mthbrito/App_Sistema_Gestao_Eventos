package ifpb.app_sistema_gestao_eventos.model.entity;

import ifpb.app_sistema_gestao_eventos.model.enumeration.TipoFuncao;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

//@Getter
//@Setter
//@Builder
//@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 50, unique = true)
    private String nome;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(nullable = false, length = 10)
    private String senha;

    @Enumerated(EnumType.STRING)
    private TipoFuncao funcao;

    private LocalDate dataCadastro;

    public Usuario(String nome, String email, String senha, TipoFuncao funcao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.funcao = funcao;
        this.dataCadastro = LocalDate.now();
    }
}
