package EstudoPoo;

/**
 * 
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
       Conversao f = new Conversao();
       f.setF(8);
       System.out.println("Temperatura de " + f.getF() + " Fahrenheit em " + "celsius: " + String.format("%.2f", f.calculeTemp()));
    
       Fatorial n = new Fatorial();
       n.setNumeroInteiroPositivo(10);
       System.out.println("resultado: " + n.calculeFatorial());    
    }
    
}
