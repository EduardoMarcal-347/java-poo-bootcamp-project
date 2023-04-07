import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Aprenda java 18 !!", 12);
        Curso curso2 = new Curso("Curso Kotlin", "Aprenda a desenvolver em Kotlin !!", 6);
        Mentoria mentoria = new Mentoria("Mentoria de Java", "Tire duvidas e aprenda com os melhores", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Kotlin","Bootcamp desenvolvendo habilidades kotlin");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev eduardo = new Dev("Eduardo");
        eduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Eduardo: "+ eduardo.getConteudosInscritos());
        System.out.printf("-----\nXP total de Eduardo: %.2f pontos\n", eduardo.calcularXP());
        eduardo.progredir();
        eduardo.progredir();
        System.out.println("-\nConteudos Inscritos de Eduardo: "+ eduardo.getConteudosInscritos());
        System.out.printf("-----\nXP total de Eduardo: %.2f pontos", eduardo.calcularXP());
    }
}