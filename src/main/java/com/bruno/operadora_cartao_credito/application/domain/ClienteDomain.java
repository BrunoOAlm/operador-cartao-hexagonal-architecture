package com.bruno.operadora_cartao_credito.application.domain;

public class ClienteEntity {


    private Long id;

    private String nome;
    private String email;
    private Integer idade;
    private String cpf;
    private double rendaMensal;


    private EnderecoEntity endereco;


    private CartaoDomain cartao;


}
