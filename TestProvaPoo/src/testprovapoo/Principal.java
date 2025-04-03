package testprovapoo;

/**
 *
 * @author Natan
 */
public class Principal {

    public static void main(String[] args) {
        Eletrodomestico fogao = new Eletrodomestico();
        fogao.setVoltagem(20);
        fogao.setMarca("Electrolux");
        fogao.setConsumo(220);
        fogao.setDimensao("110cm x 150cm x 160cm");
        System.out.println("Eletrodomestico fogao:" 
                + "\nVoltagem - " + fogao.getVoltagem() 
                + "\nConsumo - " + fogao.getConsumo() 
                + "\nMarca - " + fogao.getMarca() 
                + "\nDimensoes - " + fogao.getDimensao());
        
        Microondas micro = new Microondas();
        micro.setVoltagem(20);
        micro.setMarca("Philco");
        micro.setConsumo(110);
        micro.setDimensao("60cm x 35cm x 50cm");
        micro.setAutoLimpante(false);
        micro.setDisplayDigital(true);
        micro.setCapacidadeLitros(25);
        System.out.println("\nEletrodomestico microondas:"
                + "\nVoltagem - " + fogao.getVoltagem() 
                + "\nConsumo - " + fogao.getConsumo() 
                + "\nMarca - " + fogao.getMarca() 
                + "\nDimensoes - " + fogao.getDimensao()
                + "\n" + micro.formatarAtributosBooleanos()
                + "\nCapacidade de litros - " + micro.getCapacidadeLitros());
                        
        Televisao tv = new Televisao();
        tv.setVoltagem(20);
        tv.setMarca("Samsung");
        tv.setConsumo(110);
        tv.setDimensao("170cm x 130cm x 5cm");               
        tv.setPolegadas(55);
        tv.setTipo("720p");
        tv.setFuncoes("Smart TV");
        System.out.println("\nEletrodomestico televisao:"
                + "\nVoltagem - " + tv.getVoltagem() 
                + "\nConsumo - " + tv.getConsumo() 
                + "\nMarca - " + tv.getMarca() 
                + "\nDimensoes - " + tv.getDimensao()
                + "\nPolegadas - " + tv.getPolegadas()
                + "\nTipo - " + tv.getTipo()
                + "\nFuncoes - " + tv.getFuncoes() );
    }
    
}
