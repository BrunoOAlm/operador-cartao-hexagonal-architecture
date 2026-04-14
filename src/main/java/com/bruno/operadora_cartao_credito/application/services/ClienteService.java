package com.bruno.operadora_cartao_credito.application.services;



import com.bruno.operadora_cartao_credito.application.domain.CartaoDomain;
import com.bruno.operadora_cartao_credito.application.domain.ClienteDomain;
import com.bruno.operadora_cartao_credito.porters.out.IClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final IClienteRepository clienteRepository;
    private final GeraDadosCartaoService geraCartao;

    public ClienteDomain solicitarCartao(ClienteDomain cliente) {
        if (clienteRepository.buscarUsuarioPorEmail(cliente.getEmail())) {
            throw new IllegalArgumentException("Usuário já possui um cartão.");
        }

        CartaoDomain cartao = geraCartao.gerarParaCliente(cliente);
        cliente.setCartao(cartao);
        return clienteRepository.salvar(cliente);

    }

    public ClienteDomain buscarPorCpf(String cpf) {
        return clienteRepository.buscaUsuarioPorCpf(cpf).
                orElseThrow(()-> new IllegalArgumentException("Cliente não encontrado"));
    }
}