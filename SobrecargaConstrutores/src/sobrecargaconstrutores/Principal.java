package sobrecargaconstrutores;

/**
 *
 * @author Natan
 */
public class Principal {

    public static void main(String[] args) {
        Panela p1 = new Panela("De arroz", "Aluminio", "Medio");
        System.out.println("Panela: " 
            + p1.getNome() + "\n"
            + p1.getMaterial() + "\n"
            + p1.getTamanho() + "\n");
        
        Panela p2 = new Panela("Panela de Pressao", "Inox", "Grande", "Travamento", (10.00));
        System.out.println("***********************");
        System.out.println("Panela: " 
            + p2.getNome() + "\n"
            + p2.getMaterial() + "\n"
            + p2.getTamanho() + "\n"
            + p2.getTipoTampa() + "\n"
            + p2.getCapacidadeLitros() + "\n");
        
        Eletrodomestico e1 = new Eletrodomestico("Geladeira", "Aco inoxidavel", "Grande");
        System.out.println("***********************");
        System.out.println("Eletrodomestico: "
            + e1.getNome() + "\n"
            + e1.getMaterial() + "\n"
            + e1.getTamanho() + "\n");
        
        Eletrodomestico e2 = new Eletrodomestico("Micro-ondas", "Vidro temperado", "Medio", 1000, false);
        System.out.println("***********************");
        System.out.println("Eletrodomestico: "
            + e2.getNome() + "\n"
            + e2.getMaterial() + "\n"
            + e2.getTamanho() + "\n"
            + e2.getPotencia() + "\n"
            + e2.Timer());   
    }   
}