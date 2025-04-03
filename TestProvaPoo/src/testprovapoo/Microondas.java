package testprovapoo;

/**
 *
 * @author Natan
 */
public class Microondas extends Eletrodomestico {
    private boolean displayDigital;
    private boolean autoLimpante;
    private int capacidadeLitros;

    public boolean isDisplayDigital() {
        return displayDigital;
    }

    public void setDisplayDigital(boolean displayDigital) {
        this.displayDigital = displayDigital;
    }

    public boolean isAutoLimpante() {
        return autoLimpante;
    }

    public void setAutoLimpante(boolean autoLimpante) {
        this.autoLimpante = autoLimpante;
    }

    public int getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }
    
    public String formatarAtributosBooleanos(){
        String aux1 = "Display Digital: Nao";
        String aux2 = "Auto Limpante: Nao";
        
        if(displayDigital){
           aux1 = "Display Digital: Sim";
        }
        
        if(autoLimpante){
           aux2 = "Auto Limpante: Sim";
        }
        
        String retorno = aux1 + "\n" + aux2;
        
        return retorno;
    }
}
