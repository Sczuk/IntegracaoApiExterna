package br.com.integracaoApiExterna.integracao_Api_Externa.DTO.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ErrorApiCambioResponse {

    private String message;
    private String type;
    private String name;

}
