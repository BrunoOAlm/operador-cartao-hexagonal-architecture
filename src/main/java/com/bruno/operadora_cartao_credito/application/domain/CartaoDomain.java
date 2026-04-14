package com.bruno.operadora_cartao_credito.application.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


public class CartaoDomain {


    private Long id;
    private String numero;
    private LocalDate dataExpiracao;
    private String cvv;
    private double limite;
    private double availableLimit;
    private LocalDate ultimaAlteracaoLimite;
    private Integer dataVencimentoFatura;
    private ClienteEntity cliente;

    public CartaoEntity(String numeroCartao, LocalDate dataExpiracao, String cvv, double limiteCredito, ClienteEntity cliente, LocalDate ultimaAlteracaoLimite, Integer dataVencimentoFatura) {
    }
}
