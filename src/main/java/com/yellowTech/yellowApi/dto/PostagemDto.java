package com.yellowTech.yellowApi.dto;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class PostagemDto {


    private Long id;
    private String titulo;
    private String conteudo;
    private Date data;
    private int visualizacoes;
    private Long autorID;
    private List<Long> categoriasIds;
    

}
