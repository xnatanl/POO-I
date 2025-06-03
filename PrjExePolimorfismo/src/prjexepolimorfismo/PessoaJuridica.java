package prjexepolimorfismo;

/**
 *
 * @author Natan
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    
    public PessoaJuridica(){
        super(null);
    }
    
    public PessoaJuridica(String cnpj, String nome) {
        super(nome);
        setCnpj(cnpj);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Pessoa Juridica: " + super.getNome() + " - CNPJ: " + this.getCnpj());
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        if(cnpj.trim().length() == 14 || cnpj.trim().length() == 18){
            this.cnpj = cnpj;
        } else {
            System.out.println("CNPJ invalido\n");
        }   
    }
}
