public class Pessoa {
    private int id;
    private String nome;
    private int anoNasc;

    public Pessoa(int id, String nome, int anoNasc) {
        this.id = id;
        this.nome = nome;
        this.anoNasc = anoNasc;
    }

    public int ObterIdade(int anoAtual){

        return anoAtual-anoNasc;
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

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", anoNasc=" + anoNasc +
                '}';
    }
}
