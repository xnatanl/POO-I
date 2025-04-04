package exerciciodois;

/**
 *
 * @author Natan
 */
public class Principal {

    public static void main(String[] args) {
        Veiculo sedan = new Veiculo();
        sedan.setMarca("Toyota");
        sedan.setModelo("Corolla");
        sedan.setAno(2021);
        System.out.println("*VEICULO*"
                + "\nMarca: " + sedan.getMarca() 
                + "\nModelo: " + sedan.getModelo() 
                + "\nAno: " + sedan.getAno());
        
        Carro carroUm = new Carro(); 
        carroUm.setMarca("Fiat");
        carroUm.setModelo("Uno");
        carroUm.setAno(1995);       
        carroUm.setNumeroDePortas(4);
        carroUm.setCapacidadeTanqueCombustivel(50);
        carroUm.setTipoCombustivel("Gasolina");
        System.out.println("\n*CARRO*"
                + "\nMarca: " + carroUm.getMarca() 
                + "\nModelo: " + carroUm.getModelo() 
                + "\nAno: " + carroUm.getAno()
                + "\nNumero de portas: " + carroUm.getNumeroDePortas()
                + "\nCapacidade Tanque Combustivel: " + carroUm.getCapacidadeTanqueCombustivel()
                + "\nTipo de Combustivel: " + carroUm.getTipoCombustivel());
        carroUm.calcularAutonomiaViagem(10);
                
        Moto motoCross = new Moto();
        motoCross.setMarca("Honda");
        motoCross.setModelo("Modelo A");
        motoCross.setAno(2010);
        motoCross.setCilindradas(180);
        motoCross.setTipoFreio("disco");
        motoCross.setPossuiBau(false);
        System.out.println("\n*MOTO*"
                + "\nMarca: " + motoCross.getMarca() 
                + "\nModelo: " + motoCross.getModelo() 
                + "\nAno: " + motoCross.getAno()
                + "\nCilindradas: " + motoCross.getCilindradas()
                + "\nTipo Freio: " + motoCross.getTipoFreio()
                + "\n" + motoCross.formatarValorBau());                  
    }
    
}
