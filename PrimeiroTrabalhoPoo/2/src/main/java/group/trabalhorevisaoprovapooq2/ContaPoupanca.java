package group.trabalhorevisaoprovapooq2;

/**
  * @author natan
 */

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        if(taxaJuros >= 0.6 && taxaJuros <= 2.8){
            this.taxaJuros = taxaJuros;            
        }else this.taxaJuros = 2.0;
    }
    
    public void aplicarJuros(){
        double saldoAux = super.getSaldo();
        super.setSaldo(saldoAux + saldoAux * (taxaJuros / 100));      
    }   
}
