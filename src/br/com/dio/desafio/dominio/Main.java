package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devDavi.getConteudosInscritos());
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devDavi.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devDavi.getConteudosConcluidos());
        System.out.println("XP: " + devDavi.calcularTotalXP());

        System.out.println("-----------------");

        Dev devAlguem = new Dev();
        devAlguem.setNome("Alguém");
        devAlguem.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devAlguem.getConteudosInscritos());
        devAlguem.progredir();
        devAlguem.progredir();
        devAlguem.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devAlguem.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devAlguem.getConteudosConcluidos());
        System.out.println("XP: " + devAlguem.calcularTotalXP());

    }
}
