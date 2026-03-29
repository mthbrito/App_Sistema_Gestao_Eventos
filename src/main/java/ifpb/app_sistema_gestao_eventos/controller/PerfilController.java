package ifpb.app_sistema_gestao_eventos.controller;

import ifpb.app_sistema_gestao_eventos.model.dto.PerfilRequestDTO;
import ifpb.app_sistema_gestao_eventos.model.dto.PerfilResponseDTO;
import ifpb.app_sistema_gestao_eventos.model.entity.Perfil;
import ifpb.app_sistema_gestao_eventos.service.PerfilService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/sge/perfis")
public class PerfilController {

    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @PostMapping
    public ResponseEntity<PerfilResponseDTO> salvarPerfil(@RequestBody PerfilRequestDTO perfil) {
        return ResponseEntity.status(HttpStatus.CREATED).body(perfilService.salvarPerfil(perfil));
    }

    @GetMapping
    public ResponseEntity<List<Perfil>> listarPerfis() {
        return ResponseEntity.ok(perfilService.listarPerfis());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Perfil>> buscarPerfilPorId(@PathVariable Long id) {
        return ResponseEntity.ok(perfilService.buscarPerfilPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPerfil(@PathVariable Long id) {
        perfilService.deletarPerfil(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
