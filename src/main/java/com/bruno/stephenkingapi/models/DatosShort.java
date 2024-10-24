package com.bruno.stephenkingapi.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)


public record DatosShort(
        @JsonAlias("data") List<DatosCuentos> resultados
) {
}