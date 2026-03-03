package br.com.integracaoApiExterna.integracao_Api_Externa.DTO.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CambioRequest {

    private CotacaoRequest[] cotacoes;
    private String moeda;
    private LocalDate data;

}
