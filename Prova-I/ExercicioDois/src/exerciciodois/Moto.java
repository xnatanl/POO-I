package exerciciodois;

/**
 *
 * @author Natan
 */
public class Moto extends Veiculo {
    private int cilindradas;
    private String tipoFreio;
    private boolean possuiBau; 

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        if(tipoFreio.equals("disco") || tipoFreio.equals("tambor")){
            this.tipoFreio = tipoFreio;
        }else this.tipoFreio = "Não Informado";
    }
        

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }
    
    public String formatarValorBau(){
        String temp = "A moto não possui bau";
        
        if(possuiBau){
            temp = "A moto possui bau";
        }
        return temp;
    }
    
}
