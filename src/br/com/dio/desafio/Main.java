package br.com.dio.desafio;


import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());


        //System.out.println(curso2);
        //System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJessica = new Dev();
        devJessica.setNome("Jessica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Jéssica" + devJessica.getConteudosInscritos() );

        devJessica.progredir();
        devJessica.progredir();

        System.out.println("-");
        System.out.println("Conteúdos inscritos Jéssica" + devJessica.getConteudosInscritos() );
        System.out.println("Conteúdos concluídos Jéssica" + devJessica.getConteudosConcluidos() );
        System.out.println("XP:" + devJessica.calcularTotalXp());

        System.out.println("---");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos() );

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos() );
        System.out.println("Conteúdos concluídos João" + devJoao.getConteudosConcluidos() );
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
