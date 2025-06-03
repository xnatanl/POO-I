package prjexepolimorfismo;

/**
 *
 * @author Natan
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    
    public PessoaFisica(){
        super(null);
    }
    
    public PessoaFisica(String nome, String cpf){
        super(nome);
        setCpf(cpf);
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Pessoa Fisica: " + super.getNome() + " - CPF: " + this.getCpf());
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.trim().length() == 14 || cpf.trim().length() == 11){
            this.cpf = cpf;
        } else {
            System.out.println("CPF invalido\n");
        }
        
    }
}
