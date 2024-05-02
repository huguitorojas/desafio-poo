package org.hugo;

import org.hugo.Dominio.Bootcamp;
import org.hugo.Dominio.Curso;
import org.hugo.Dominio.Dev;
import org.hugo.Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Fundamentals");
        curso1.setDescricao("Primeiros passos com Java");
        curso1.setCargaHoraria(25);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python Fundamentals");
        curso2.setDescricao("Primeiros passos com Python");
        curso2.setCargaHoraria(20);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Api Stream");
        mentoria1.setDescricao("Aprendendo os conceitos de Api Stream");
        mentoria1.setData(LocalDate.of(2024, 10, 25));

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp 1");
        bootcamp1.setDescricao("Primeiro BootCamp");
        bootcamp1.addConteudos(curso1);
        bootcamp1.addConteudos(curso2);
        bootcamp1.addConteudos(mentoria1);

        System.out.println("====================");
        System.out.println(bootcamp1.getDevInscritos());

        System.out.println("====================");

        Dev devHugo = new Dev();
        devHugo.setNome("hugo");
        devHugo.inscreverBootcamp(bootcamp1);
        System.out.println(devHugo.getConteudosInscritos());

        devHugo.progredir();
        devHugo.progredir();
        System.out.println(devHugo.getConteudoConcluido());
        System.out.println(devHugo.calcularTotalXp());

        System.out.println("====================");


        Dev devIriel = new Dev();
        devIriel.setNome("iriel");
        devIriel.inscreverBootcamp(bootcamp1);
        System.out.println(devIriel.getConteudosInscritos());

        devIriel.progredir();
        devIriel.progredir();
        devIriel.progredir();
        System.out.println(devIriel.getConteudoConcluido());
        System.out.println(devIriel.calcularTotalXp());


        System.out.println("====================");
        System.out.println(bootcamp1.getDevInscritos());  









    }
}
