package com.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O Atributo Descrição é obrigatório")
    private String descricao;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nome", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("nome")
    private List<Produto> produto;

    public Long getId() {
        return id;
    }

    public Categoria setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria setDescricao( String descricao) {
        this.descricao = descricao;
        return this;
    }


    public List<Produto> getProduto() {
        return produto;
    }

    public Categoria setProduto(List<Produto> produto) {
        this.produto = produto;
        return this;
    }
}
