package br.com.integracaoApiExterna.integracao_Api_Externa.useCases.externalApi;

import br.com.integracaoApiExterna.integracao_Api_Externa.DTO.request.CambioRequest;
import br.com.integracaoApiExterna.integracao_Api_Externa.DTO.response.CambioResponse;
import br.com.integracaoApiExterna.integracao_Api_Externa.mapper.CambioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDate;

@Service
public class  GetMoeda {

    @Autowired
    CambioMapper mapper;

    public CambioResponse execute(String moeda, LocalDate date){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://brasilapi.com.br/api/cambio/v1/cotacao/%s/%s";
        CambioRequest cambioRequest = restTemplate.getForObject(String.format(url, moeda, date),CambioRequest.class);
        CambioResponse response = mapper.toDTO(cambioRequest);
        return response;
    }

}
