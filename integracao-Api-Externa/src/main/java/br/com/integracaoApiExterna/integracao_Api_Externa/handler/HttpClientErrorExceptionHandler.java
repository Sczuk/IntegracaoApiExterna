package br.com.integracaoApiExterna.integracao_Api_Externa.handler;

import br.com.integracaoApiExterna.integracao_Api_Externa.DTO.response.ErrorApiCambioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import tools.jackson.databind.ObjectMapper;

@RestControllerAdvice
public class HttpClientErrorExceptionHandler {

    @Autowired
    ObjectMapper objectMapper;

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<ErrorApiCambioResponse> handlerException(HttpClientErrorException ex){
        ErrorApiCambioResponse error = objectMapper.readValue(ex.getResponseBodyAsString(),ErrorApiCambioResponse.class);
        return ResponseEntity.status(ex.getStatusCode().value()).body(error);
    }
}
