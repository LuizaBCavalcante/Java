import java.util.List;

public class CursoAprendiz {
    private int id;
    private List<Double> notas;
    private List<Boolean> presencas;


    public CursoAprendiz(int id, List<Double> notas, List<Boolean> presencas) {
        this.id = id;
        this.notas = notas;
        this.presencas = presencas;
    }

    public double obterNotaFinal(){
        double soma =0;
        for(Double nota:notas){
            soma+=nota;
        }
        return soma/notas.size();
    }
    public double obterPresenca(){
       int contPresenca=0;
       for(Boolean presenca: presencas){
           if(presenca){
               contPresenca++;
           }
       }
       return contPresenca/(double)presencas.size() *100;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public List<Boolean> getPresencas() {
        return presencas;
    }

    public void setPresencas(List<Boolean> presencas) {
        this.presencas = presencas;
    }

    @Override
    public String toString() {
        return "CursoAprendiz{" +
                "id=" + id +
                ", notas=" + notas +
                ", presencas=" + presencas +
                '}';
    }
}
