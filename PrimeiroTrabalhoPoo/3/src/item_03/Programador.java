package item_03;

public class Programador extends Funcionario {
    private double valorPontoFuncao;
    
    public double getValorPontoFuncao() {
        return valorPontoFuncao;
    }

    public void setValorPontoFuncao(double valorPontoFuncao) {
        this.valorPontoFuncao = valorPontoFuncao;
    }
    
    public double calcularValorSoftware(int linhasCodigo) {
        return valorPontoFuncao * linhasCodigo;
    }
 
}
