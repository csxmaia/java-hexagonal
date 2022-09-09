package com.arch.hexagonal.app.dominio;

public class Filme {
    private Long codigo;
    private String nome;
    private String sinopse;
    private String classificacao;

    public Filme() {

    }
    public Filme(Long codigo, String nome, String sinopse, String classificacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.sinopse = sinopse;
        this.classificacao = classificacao;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
}
