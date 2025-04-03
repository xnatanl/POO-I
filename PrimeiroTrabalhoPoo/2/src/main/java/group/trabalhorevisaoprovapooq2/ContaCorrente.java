package group.trabalhorevisaoprovapooq2;

/**
  * @author natan
 */

public class ContaCorrente extends ContaBancaria {
    private double limiteEspecial;

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        if(limiteEspecial <= 0.4 * super.getRendaMensal()){
            this.limiteEspecial = limiteEspecial;
            System.out.println("Limite atualizado no valor de R$" + limiteEspecial + " para a conta de " + super.getTitular());
        }else System.out.println("Limite solicitado no valor de R$" + limiteEspecial + " eh incompativel com a renda Mensal de " + super.getTitular());
    }   
}
