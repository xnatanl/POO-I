package prjclassesabstratas;

import prjclassesabstratas.classes.Conta;
import prjclassesabstratas.classes.ContaPoupanca;

/**
 *
 * @author Natan
 */
public class PrjClassesAbstratas {

    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(1000);
        cp.imprimirExtrato();

    }
    
}
