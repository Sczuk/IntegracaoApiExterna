package br.com.integracaoApiExterna.integracao_Api_Externa.DTO.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class CotacaoRequest {

    private int paridade_compra;
    private int paridade_venda;
    private double cotacao_compra;
    private double cotacao_venda;
    private String data_hora_cotacao;
    private String tipo_boletim;

}
