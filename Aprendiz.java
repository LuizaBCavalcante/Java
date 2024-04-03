import java.util.ArrayList;
import java.util.List;
public class Aprendiz extends Pessoa {
    private int codigo;
    private List<CursoAprendiz> cursoAp;

    public Aprendiz(int id, String nome, int anoNasc, int codigo) {
        super(id, nome, anoNasc);
        this.codigo = codigo;
        cursoAp = new ArrayList<>();
    }

    public void addCursoAp(CursoAprendiz ca){
        cursoAp.add(ca);

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<CursoAprendiz> getCursoAp() {
        return cursoAp;
    }

    public void setCursoAp(List<CursoAprendiz> cursoAp) {
        this.cursoAp = cursoAp;
    }

    @Override
    public String toString() {
        return "Aprendiz{" + super.toString()+
                "codigo=" + codigo +
                ", cursoAp=" + cursoAp +
                '}';
    }
}
