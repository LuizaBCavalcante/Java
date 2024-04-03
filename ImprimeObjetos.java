public class ImprimeObjetos {

    public static void imprimirInformacoes(Pessoa[] pessoas) {
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa.toString());

                if (pessoa instanceof Instrutor) {
                    Instrutor instrutor = (Instrutor) pessoa;
                    System.out.println("Salário do Instrutor: " + instrutor.obterSalario());
                } else if (pessoa instanceof Aprendiz) {
                    Aprendiz aprendiz = (Aprendiz) pessoa;
                    System.out.println("Cursos do Aprendiz: " + aprendiz.getCursoAp());
                }

                System.out.println("------------------------");
            }
        }

}
