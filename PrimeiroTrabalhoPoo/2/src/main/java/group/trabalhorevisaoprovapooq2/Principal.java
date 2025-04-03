package group.trabalhorevisaoprovapooq2;

/**
  * @author natan
 */

public class Principal {

    public static void main(String[] args) {
        ContaBancaria test1 = new ContaBancaria();
        test1.setTitular("NAYARA");
        test1.setSaldo(100.00);
        test1.setRendaMensal(500.00);
        System.out.println("*Conta Bancaria - Titular: " + test1.getTitular() + ", saldo de R$" + test1.getSaldo() + ", renda mensal de R$" + test1.getRendaMensal());
        test1.depositar(100);
        test1.sacar(5000);
        test1.verificarSaldo();
        
        ContaBancaria test2 = new ContaBancaria();
        test2.setTitular("JEAN");
        test2.setSaldo(5000.00);
        test2.setRendaMensal(4000.00);
        System.out.println("\n*Conta Bancaria - Titular: " + test2.getTitular() + ", saldo de R$" + test2.getSaldo() + ", renda mensal de R$" + test2.getRendaMensal());
        test2.depositar(1000);
        test2.sacar(1);
        test2.verificarSaldo();
        
        ContaBancaria test3 = new ContaBancaria();
        test3.setTitular("");
        test3.setSaldo(2500.00);
        test3.setRendaMensal(3036.00);
        System.out.println("\n*Conta Bancaria - Titular: " + test3.getTitular() + ", saldo de R$" + test3.getSaldo() + ", renda mensal de R$" + test3.getRendaMensal());       
        test3.depositar(1000);
        test3.sacar(198);
        test3.verificarSaldo();  
        
        
//-------------------------ContaPoupanca--------------------------------------//
        
        ContaPoupanca test4 = new ContaPoupanca();
        test4.setTitular("FLAVIO");
        test4.setSaldo(100000.00);
        test4.setRendaMensal(50000.00);
        test4.setTaxaJuros(0.5);
        test4.aplicarJuros();
        System.out.println("\n*Conta Poupanca - Titular: " + test4.getTitular() + ",\nTaxa de juros: R$" + test4.getTaxaJuros() + "\nsaldo atual de R$" + test4.getSaldo() + ",\nrenda mensal de R$" + test4.getRendaMensal());               

        ContaPoupanca test5 = new ContaPoupanca();
        test5.setTitular("ELENIS");
        test5.setSaldo(50000.00);
        test5.setRendaMensal(40000.00);
        test5.setTaxaJuros(1.5);
        test5.aplicarJuros();
        System.out.println("\n*Conta Poupanca - Titular: " + test5.getTitular() + ",\nTaxa de juros: R$" + test5.getTaxaJuros() + "\nsaldo atual de R$" + test5.getSaldo() + ",\nrenda mensal de R$" + test5.getRendaMensal());               

        ContaPoupanca test6 = new ContaPoupanca();
        test6.setTitular("LUIZA");
        test6.setSaldo(25000.00);
        test6.setRendaMensal(30360.00);
        test6.setTaxaJuros(2.5);
        test6.aplicarJuros();
        System.out.println("\n*Conta Poupanca - Titular: " + test6.getTitular() + ",\nTaxa de juros: R$" + test6.getTaxaJuros() + "\nsaldo atual de R$" + test6.getSaldo() + ",\nrenda mensal de R$" + test6.getRendaMensal());               

        
//-------------------------ContaCorrente--------------------------------------//

        ContaCorrente test7 = new ContaCorrente();
        test7.setTitular("TAMIRIS");
        test7.setSaldo(1000.00);
        test7.setRendaMensal(1000.00);
        System.out.println("\n*Conta Corrente - Titular: " + test7.getTitular() + ", saldo de R$" + test7.getSaldo() + ", renda mensal de R$" + test7.getRendaMensal());
        test7.setLimiteEspecial(10000.00);
        
        ContaCorrente test8 = new ContaCorrente();
        test8.setTitular("NILDA");
        test8.setSaldo(2000.00);
        test8.setRendaMensal(2000.00);
        System.out.println("\n*Conta Corrente - Titular: " + test8.getTitular() + ", saldo de R$" + test8.getSaldo() + ", renda mensal de R$" + test8.getRendaMensal());
        test8.setLimiteEspecial(10000.00);        
        
        ContaCorrente test9 = new ContaCorrente();
        test9.setTitular("ANTONIO");
        test9.setSaldo(3000.00);
        test9.setRendaMensal(3000.00);
        System.out.println("\n*Conta Corrente - Titular: " + test9.getTitular() + ", saldo de R$" + test9.getSaldo() + ", renda mensal de R$" + test9.getRendaMensal());
        test9.setLimiteEspecial(300.00);
    }
}
