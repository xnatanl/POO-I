package testprovapoo;

/**
 *
 * @author Natan
 */
public class Eletrodomestico {
    private int voltagem;
    private String marca;
    private int consumo;
    private String dimensao;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        if(consumo == 110 || consumo == 220){
            this.consumo = consumo;
        }else this.consumo = 110;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }
}
