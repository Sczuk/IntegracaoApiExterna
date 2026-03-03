package br.com.integracaoApiExterna.integracao_Api_Externa.DTO.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class CambioResponse {

    private CotacaoResponse[] cotacoes;
    private String moeda;
    private LocalDate data;

}
