package ifpb.app_sistema_gestao_eventos.controller;

import ifpb.app_sistema_gestao_eventos.model.dto.NotificacaoResponseDTO;
import ifpb.app_sistema_gestao_eventos.model.entity.Notificacao;
import ifpb.app_sistema_gestao_eventos.service.NotificacaoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/sge/notificacoes")
public class NotificacaoController {

    private final NotificacaoService notificacaoService;

    public NotificacaoController(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    @PostMapping
    public ResponseEntity<Notificacao> salvarNotificacao(@Valid @RequestBody Notificacao notificacao) {
        return ResponseEntity.status(HttpStatus.CREATED).body(notificacaoService.salvarNotificacao(notificacao));
    }

    @GetMapping
    public ResponseEntity<List<NotificacaoResponseDTO>> listarNotificacoes() {
        return ResponseEntity.ok(notificacaoService.listarNotificacoes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<NotificacaoResponseDTO>> buscarNotificacaoPorId(@PathVariable Long id) {
        return ResponseEntity.ok(notificacaoService.buscarNotificacaoPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarNotificacao(@PathVariable Long id) {
        notificacaoService.deletarNotificacao(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
