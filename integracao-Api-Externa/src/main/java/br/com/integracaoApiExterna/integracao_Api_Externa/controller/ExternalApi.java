package br.com.integracaoApiExterna.integracao_Api_Externa.controller;

import br.com.integracaoApiExterna.integracao_Api_Externa.DTO.response.CambioResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/cambio")
public class ExternalApi {

    @GetMapping("/{moeda}/{data}")
    public ResponseEntity<CambioResponse> getCambio(@PathVariable String cambio, @PathVariable LocalDate data){
        return null;
    }


}
