package sobrecargaconstrutores;

/**
 *
 * @author Natan
 */
public class Eletrodomestico extends Utensilio {
    private int potencia;
    private boolean temTimer;

    public Eletrodomestico(String nome, String material, String tamanho){
        super(nome, material, tamanho);
    }
    
    public Eletrodomestico(String nome, String material, String tamanho, int potencia, boolean temTimer){
        super(nome, material, tamanho);
        this.potencia = potencia;
        this.temTimer = temTimer;
    }
    
    public String Timer(){
        if(temTimer){
            return "Com timer";
        }else return "Sem timer";
    }
    
    public int getPotencia() {
        return potencia;
    }

    public boolean isTemTimer() {
        return temTimer;
    }
}
