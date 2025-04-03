package group.trabalhorevisaoprovapooq2;

/**
  * @author natan
 */

public class ContaBancaria {
    private String titular;
    private double saldo;
    private double rendaMensal;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular.equals("")){
            this.titular = "Nao identificado";
        }else this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        if(rendaMensal >= 3036.00){
            this.rendaMensal = rendaMensal;
        }else this.rendaMensal = 3036.00;
    }
    
    public void depositar(double montante){
        this.saldo += montante;
        System.out.println("Deposito de R$" + montante + " para a conta titular de " + titular + " foi efetuado com sucesso!");
    }
    
    public void sacar(double montante){
        if(saldo > montante){
            saldo -= montante;
            System.out.println("Saque de R$" + montante + " na conta titular de " + titular + " foi efetuado com sucesso");
        }else System.out.println(titular + ", seu saldo de R$" + saldo + " eh insuficiente para sacar R$" + montante);
    }
    
    public void verificarSaldo(){
        System.out.println("O saldo na conta de " + titular + " eh R$" + saldo);
    }
}
