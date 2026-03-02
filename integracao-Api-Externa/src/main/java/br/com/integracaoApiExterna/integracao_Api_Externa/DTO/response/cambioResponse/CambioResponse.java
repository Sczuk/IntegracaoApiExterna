package br.com.integracaoApiExterna.integracao_Api_Externa.DTO.response.cambioResponse;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class CambioResponse {

    private String moeda;
    private LocalDate date;
    private CotacaoResponse cotacao;

}
