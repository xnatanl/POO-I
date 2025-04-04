package exerciciodois;

/**
 *
 * @author Natan
 */
public class Carro extends Veiculo {
    private int numeroDePortas;
    private int capacidadeTanqueCombustivel;
    private String tipoCombustivel;

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getCapacidadeTanqueCombustivel() {
        return capacidadeTanqueCombustivel;
    }

    public void setCapacidadeTanqueCombustivel(int capacidadeTanqueCombustivel) {
        this.capacidadeTanqueCombustivel = capacidadeTanqueCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        if(tipoCombustivel.equals("Gasolina") || tipoCombustivel.equals("Alcool") || tipoCombustivel.equals("Elétrico")){
            this.tipoCombustivel = tipoCombustivel;
        }else this.tipoCombustivel = "Não Informado";      
    }
    
    public void calcularAutonomiaViagem(int kmLitro){
        int kmTanqueCheio = capacidadeTanqueCombustivel * kmLitro;
        System.out.println("Este carro consegue percorrer com o tanque cheio: " + kmTanqueCheio + "Km");
    }
       
}
