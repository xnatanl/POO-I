package aulasobrecarga;

/**
 *
 * @author natan
 */
public class Principal {

    public static void main(String[] args) {
        /*Calcular soma1 = new Calcular();
        soma1.somar(5,10);
        
        Calcular soma2 = new Calcular();
        soma2.somar(5,10, 15);
        
        Calcular soma3 = new Calcular();
        soma3.somar(5.2, 3.1);
        
        Empregado joao = new Empregado("Joao", "TI", 800.00);
        System.out.println("******Empregado*******\n" + joao.mostrarInformacoes());
        
        Terceirizado maria = new Terceirizado("Maria", "Turismo", 900, "Fatos-Tur", 120.00);
        System.out.println("******Empregado*******\n" + maria.mostrarInformacoes());
       */
        
        Empregado joao = new Empregado("Joao", "TI", 800.00);
        System.out.println(joao.toString());
        
        Terceirizado maria = new Terceirizado("Maria", "Turismo", 900, "Fatos-Tur", 120.00);
        System.out.println(maria.toString());
    } 
}
