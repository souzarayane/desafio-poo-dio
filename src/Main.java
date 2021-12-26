import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria em Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.SetNome("Bootcamp Java Developer");
        bootcamp.SetDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoaquina = new Dev();
        devJoaquina.setNome("Joaquina");
        devJoaquina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joaquina" + devJoaquina.getConteudosInscritos());
        devJoaquina.progredir();
        devJoaquina.progredir();
        System.out.println("Conteúdos inscritos Joaquina" + devJoaquina.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Joaquina" + devJoaquina.getConteudosConcluidos());
        System.out.println("XP:" + devJoaquina.calcularTotalXp());

        System.out.println("---------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
