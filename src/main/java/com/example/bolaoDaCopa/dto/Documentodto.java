package com.example.bolaoDaCopa.DTO;

import lombok.Data;

public class Documentodto {
    @Data
    public class DocumentoDTO {
        private Long id_documento;
        private String cpf;
        private String cnpj;
        private String rg;
    }
}