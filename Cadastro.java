import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cadastro {
    public static Pessoa[] criaPessoas() {
        Pessoa[] pessoas = new Pessoa[4];
        Curso[] cursos = new Curso[2];

        Instrutor i1 = new Instrutor(111, "Ana", 1990, "Mestrado", 1, 3000.0);
        Aprendiz a1 = new Aprendiz(222, "Luiza", 1992, 202);
        Curso c1 = new Curso(333, "Piano");


        Instrutor i2 = new Instrutor(444, "Paula", 1991, "Doutorado", 1, 4000.0);
        Aprendiz a2 = new Aprendiz(555, "Joana", 1996, 505);
        Curso c2 = new Curso(666, "Teatro");

        a1.addCursoAp(new CursoAprendiz(1, Arrays.asList(8.5, 7.5, 9.0, 8.0), Arrays.asList(true, true, false, true, true)));
        a2.addCursoAp(new CursoAprendiz(2, Arrays.asList(7.0, 6.5, 8.0, 7.5), Arrays.asList(true, true, true, true, false)));



        pessoas[0] = i1;
        pessoas[1] = i2;
        pessoas[2] = a1;
        pessoas[3] = a2;

        return pessoas;

    }

}