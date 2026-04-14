package com.bruno.operadora_cartao_credito.adapters.in.controller;



import com.bruno.operadora_cartao_credito.adapters.in.IClientService;
import com.bruno.operadora_cartao_credito.adapters.in.dto.request.ClienteRequestDTO;
import com.bruno.operadora_cartao_credito.adapters.in.dto.response.ClienteResponseDTO;
import com.bruno.operadora_cartao_credito.adapters.mapper.ClienteMapper;
import com.bruno.operadora_cartao_credito.application.domain.ClienteDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final IClientService clientService;
    private final ClienteMapper mapper;

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> solicitaCartao(@RequestBody ClienteRequestDTO clienteRequestDTO) {
        mapper.toResponse(clientService.solicitarCartao(mapper.toDomain(clienteRequestDTO)));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<ClienteResponseDTO> buscaClientePorCpf(@RequestParam String cpf) {
        ClienteDomain cliente = clientService.buscarPorCpf(cpf);
        return ResponseEntity.ok(mapper.toResponse(cliente));
    }
}
