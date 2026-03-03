package br.com.integracaoApiExterna.integracao_Api_Externa.controller;

import br.com.integracaoApiExterna.integracao_Api_Externa.DTO.response.CambioResponse;
import br.com.integracaoApiExterna.integracao_Api_Externa.useCases.externalApi.GetMoeda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/cambio")
public class ExternalApiController {


    @Autowired
    GetMoeda getMoeda;

    @GetMapping("/{moeda}/{data}")
    public ResponseEntity<CambioResponse> getCambio(@PathVariable String moeda, @PathVariable LocalDate data){
        return ResponseEntity.ok(getMoeda.execute(moeda,data));
    }


}
