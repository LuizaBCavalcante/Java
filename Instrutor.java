public class Instrutor extends Pessoa {
    private String titulacao;
    private int quantidadeTitulacao;
    private double fixo;

    public Instrutor(int id, String nome, int anoNasc, String titulacao, int quantidadeTitulacao, double fixo) {
        super(id, nome, anoNasc);
        this.titulacao = titulacao;
        this.quantidadeTitulacao = quantidadeTitulacao;
        this.fixo = fixo;
    }

    public double obterSalario(){
       int contVogais =0;
       for(char c: titulacao.toCharArray()){
           if("aeiouAEIOU".indexOf(c) != -1){
               contVogais ++;
           }
       }
       return (fixo+contVogais*quantidadeTitulacao);
    }

    @Override
    public String toString() {
        return "Instrutor{" + super.toString()+
                "titulacao='" + titulacao + '\'' +
                ", quantidadeTitulacao=" + quantidadeTitulacao +
                ", fixo=" + fixo +
                '}';
    }
}
