package org.hugo.Dominio;

public abstract class Conteudo {
    protected static double XP_INICIAL = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public static double getXpInicial() {
        return XP_INICIAL;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}