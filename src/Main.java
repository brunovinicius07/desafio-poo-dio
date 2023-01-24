import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Back-End");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Angular");
        curso2.setDescricao("Front-End");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("POO");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Java/SpringBoot");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Bruno:" + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Bruno:" + devBruno.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Bruno:" + devBruno.getConteudosInscritos());
        System.out.println("XP: " + devBruno.calcularTotalXp());


        System.out.println("---------");

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Luiz:" + devLuiz.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Luiz:" + devLuiz.getConteudosInscritos());
        System.out.println("XP: " + devLuiz.calcularTotalXp());

    }
}