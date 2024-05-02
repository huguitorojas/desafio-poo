package org.hugo.Dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFinalizacao = LocalDate.now().plusDays(45);
    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFinalizacao() {
        return dataFinalizacao;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }
    public void addDevInscritos(Dev dev) {
        devInscritos.add(dev);
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void addConteudos(Conteudo conteudos) {
        this.conteudos.add(conteudos);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(getNome(), bootcamp.getNome()) && Objects.equals(getDescricao(), bootcamp.getDescricao()) && Objects.equals(getDataInicio(), bootcamp.getDataInicio()) && Objects.equals(getDataFinalizacao(), bootcamp.getDataFinalizacao()) && Objects.equals(getDevInscritos(), bootcamp.getDevInscritos()) && Objects.equals(getConteudos(), bootcamp.getConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getDescricao(), getDataInicio(), getDataFinalizacao(), getDevInscritos(), getConteudos());
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFinalizacao=" + dataFinalizacao +
                ", devInscritos=" + devInscritos +
                ", conteudos=" + conteudos +
                '}';
    }
}
