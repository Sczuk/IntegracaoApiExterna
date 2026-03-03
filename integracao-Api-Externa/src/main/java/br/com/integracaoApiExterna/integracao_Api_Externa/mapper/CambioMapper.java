package br.com.integracaoApiExterna.integracao_Api_Externa.mapper;

import br.com.integracaoApiExterna.integracao_Api_Externa.DTO.request.CambioRequest;
import br.com.integracaoApiExterna.integracao_Api_Externa.DTO.response.CambioResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CambioMapper {

    CambioResponse toDTO(CambioRequest cambioRequest);
}
