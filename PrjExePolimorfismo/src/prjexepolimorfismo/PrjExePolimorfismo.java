package prjexepolimorfismo;

/**
 *
 * @author Natan
 */
public class PrjExePolimorfismo {

    public static void main(String[] args) {
       /* Pessoa pf_0 = new PessoaFisica("Pessoa Fisica 1", "152.258.566-40");
        Pessoa pj_0 = new PessoaJuridica ("17840166000119", "Pessoa Juridica 1");
        
        pf_0.mostrarInfo();
        pj_0.mostrarInfo();
        */
        
       Pessoa pf_1 = new PessoaFisica();
       pf_1.mostrarInfo();
       PessoaFisica pf_2 = new PessoaFisica();
       pf_2.setNome("Pessoa Fisica 2");
       pf_2.setCpf("152.258.566-40");
       
       pf_1 = pf_2;
       
       pf_1.mostrarInfo();
        
    }
    
}
