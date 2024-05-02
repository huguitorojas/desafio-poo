package org.hugo.Dominio;

import java.time.LocalDate;

public class Curso extends Conteudo{

    private double cargaHoraria;


    @Override
    public double calcularXp() {

        return XP_INICIAL * cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return super.toString() + "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}
