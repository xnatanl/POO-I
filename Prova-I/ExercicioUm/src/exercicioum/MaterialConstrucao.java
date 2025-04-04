package exercicioum;

/**
 *
 * @author Natan
 */
public class MaterialConstrucao {
    private String classe;
    private double valorVarejo;
    private double valorAtacado;
    private String especificacao;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        if(classe.equals("Cimento") || classe.equals("Encanamento") || classe.equals("Pintura")){
            this.classe = classe; 
       }else this.classe = "NDA";
    }

    public double getValorVarejo() {
        return valorVarejo;
    }

    public void setValorVarejo(double valorVarejo) {
        if(valorVarejo > 2.00){
            this.valorVarejo = valorVarejo;
        }else this.valorVarejo = 2.0;
    }

    public double getValorAtacado() {
        return valorAtacado;
    }

    public void setValorAtacado(double valorAtacado) {
        if(valorAtacado < valorVarejo){
            this.valorAtacado = valorAtacado;
        }else this.valorAtacado = 1.00;        
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

}
