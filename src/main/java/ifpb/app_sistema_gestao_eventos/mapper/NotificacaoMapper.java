package ifpb.app_sistema_gestao_eventos.mapper;

import ifpb.app_sistema_gestao_eventos.model.dto.NotificacaoResponseDTO;
import ifpb.app_sistema_gestao_eventos.model.entity.Notificacao;

public class NotificacaoMapper {

    public static NotificacaoResponseDTO toNotificacaoResponseDTO(Notificacao notificacao) {

        if (notificacao == null) {
            return null;
        }

        String usuarioNome = null;

        if (notificacao.getUsuario() != null) {
            usuarioNome = notificacao.getUsuario().getNome();
        }

        return new NotificacaoResponseDTO(
                notificacao.getId(),
                notificacao.getMensagem(),
                notificacao.getDataEnvio(),
                notificacao.isLida(),
                usuarioNome
        );
    }

}
