

package prjclassesabstratas.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Natan
 */
public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("$$$ Extrato da Conta $$$");
        
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date date = new Date();
        
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + d.format(date));
        
    }
    
}
