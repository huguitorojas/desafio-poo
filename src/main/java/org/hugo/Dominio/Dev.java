package org.hugo.Dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);

    }
    public void progredir(){
        Optional<Conteudo> conteudo  = conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            conteudoConcluido.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        }else
            System.out.println("Voce nao esta matriculado em nenhum conteudo");

    }
    public double calcularTotalXp(){
        double soma = conteudoConcluido.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();

        return soma;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev)) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome()) && Objects.equals(getConteudosInscritos(), dev.getConteudosInscritos()) && Objects.equals(getConteudoConcluido(), dev.getConteudoConcluido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudosInscritos(), getConteudoConcluido());
    }
}
