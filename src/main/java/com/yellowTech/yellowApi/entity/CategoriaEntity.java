package com.yellowTech.yellowApi.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "categorias")
    private List<PostagemEntity> postagens = new ArrayList<>();

    @OneToMany(mappedBy = "categoriaPai", cascade = CascadeType.ALL)
    private List<CategoriaEntity> subCategorias = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "categoria_pai_id")
    private CategoriaEntity categoriaPai;

}
