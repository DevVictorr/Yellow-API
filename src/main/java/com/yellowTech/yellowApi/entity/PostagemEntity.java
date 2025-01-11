package com.yellowTech.yellowApi.entity;

import java.sql.Date;
import java.util.List;
import java.util.TimeZone;

import javax.xml.crypto.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PostagemEntity {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String titulo;

@Lob
private String conteudo;

private Date data;
private int visualizacoes;

@ManyToOne
@JoinColumn(name = "autor_id")
private String autor;

@ManyToMany
@JoinTable(name = "postagem_categoria", joinColumns = @JoinColumn(name = "postagem_id"),inverseJoinColumns = @JoinColumn (name = "categoria_id"))
private List<CategoriaEntity> categorias;





}
