package exercicioum;

/**
 *
 * @author Natan
 */
public class Principal {

    public static void main(String[] args) {
        MaterialConstrucao bloco = new MaterialConstrucao();
        bloco.setClasse("Alvenaria");
        bloco.setValorVarejo(1.0);
        bloco.setValorAtacado(2.0);
        bloco.setEspecificacao("Material para assentamento");
        System.out.println("MATERIAL DE CONSTRUCAO:\nClasse: " 
                + bloco.getClasse() + "\nValor Varejo: " 
                + bloco.getValorVarejo() + "\nValor Atacado: " 
                + bloco.getValorAtacado() + "\nEspecificacao: " 
                + bloco.getEspecificacao());
        
        MaterialConstrucao tinta = new MaterialConstrucao();
        tinta.setClasse("Pintura");
        tinta.setValorVarejo(3.4);
        tinta.setValorAtacado(2.9);
        tinta.setEspecificacao("Cor branco gelo");
        System.out.println("\nMATERIAL DE CONSTRUCAO:\nClasse: " 
                + tinta.getClasse() + "\nValor Varejo: " 
                + tinta.getValorVarejo() + "\nValor Atacado: " 
                + tinta.getValorAtacado() + "\nEspecificacao: " 
                + tinta.getEspecificacao());
    }
    
}
