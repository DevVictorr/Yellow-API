package com.yellowTech.yellowApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CategoriaDto {

    private Long id;
    private String nome;
    private Long categoriaPaiId;

}
