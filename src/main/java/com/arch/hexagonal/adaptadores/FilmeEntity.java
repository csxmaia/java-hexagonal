package com.arch.hexagonal.adaptadores;

import com.arch.hexagonal.app.dominio.Filme;

import javax.persistence.*;

@Entity
@Table(name = "filme")
public class FilmeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sinopse")
    private String sinopse;

    @Column(name = "classificacao")
    private String classificacao;

    public FilmeEntity() {

    }

    public FilmeEntity(Filme filme) {
        this.codigo = filme.getCodigo();
        this.nome = filme.getNome();
        this.sinopse = filme.getSinopse();
        this.classificacao = filme.getClassificacao();
    }

    public Filme toFilme() {
        Filme filme = new Filme(this.codigo, this.nome, this.sinopse, this.classificacao);
        return filme;
    }


}
