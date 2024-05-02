package org.hugo.Dominio;

import sun.util.resources.LocaleData;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;
    @Override
    public double calcularXp() {
        return XP_INICIAL + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() + "Mentoria{" +
                "data=" + data +
                '}';
    }
}
