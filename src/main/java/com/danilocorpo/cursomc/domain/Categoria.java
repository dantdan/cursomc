package com.danilocorpo.cursomc.domain;

import java.io.Serializable;

public class Categoria implements Serializable {

    // Versão 1 da classe do tipo Serializable
    private static final long seriaLVersionUID = 1l;
    private Integer id;
    private String nome;

    public Categoria(){
    }

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria)) return false;

        Categoria categoria = (Categoria) o;

        return getId().equals(categoria.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
