package aulasobrecarga;

/**
 *
 * @author IFTM
 */
public class Calcular {
    
    public void somar(int a, int b){
        System.out.println("A soma de: " + a + " + " + b + " = " + (a + b));
    }
    
    public void somar(int a, int b, int c){
        System.out.println("A soma de: " + a + " + " + b + " + " + c + " = " + (a + b + c));
    }
    
    public void somar(double a, double b){
        System.out.println("A soma de: " + a + " + " + b + " = " + (a + b));
    }
    
}
