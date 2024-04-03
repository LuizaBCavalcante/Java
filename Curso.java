import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Curso {
    private int id;
    private String nome;
    private List<CursoAprendiz> cursoAp;

    public Curso(int id, String nome) {
        this.id = id;
        this.nome = nome;
        cursoAp = new ArrayList<>();
    }

    public Map<String, Double> calcularNotasFinais() {
        Map<String, Double> notasFinais = new HashMap<>();
        for (CursoAprendiz x : cursoAp) {
            notasFinais.put("Aprendiz: " + x.getId(), x.obterNotaFinal());
        }
        return notasFinais;
    }

    public Map<String, Double> obterPercentuaisPresencas() {
        Map<String, Double> percentuaisPresencas = new HashMap<>();
        for (CursoAprendiz x : cursoAp) {
            percentuaisPresencas.put("Aprendiz: " + x.getId(), x.obterPresenca());
        }
        return percentuaisPresencas;
    }



    public void addAprendiz(Aprendiz aprendiz) {
        // instância de CursoAprendiz para o aprendiz
        CursoAprendiz cursoAprendiz = new CursoAprendiz(aprendiz.getId(), new ArrayList<>(), new ArrayList<>());

        // Adicionar o CursoAprendiz à lista de CursoAprendiz do Curso
        cursoAp.add(cursoAprendiz);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CursoAprendiz> getCursoAprendizes() {
        return cursoAp;
    }

    public void setCursoAprendizes(List<CursoAprendiz> cursoAprendizes) {
        this.cursoAp = cursoAprendizes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cursoAprendizes=" + cursoAp +
                '}';
    }
}

