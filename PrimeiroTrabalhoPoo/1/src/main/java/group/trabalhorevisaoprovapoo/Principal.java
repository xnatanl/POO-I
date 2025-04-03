package group.trabalhorevisaoprovapoo;

/**
 *
 * @author natan
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa natan = new Pessoa();
        natan.setCodigo(1);
        natan.setNome("Natan");
        natan.setDataCadastro("03-04-2025");
        System.out.println("****PESSOA****"
                + "\nCODIGO: " + natan.getCodigo()
                + "\nNOME: " + natan.getNome()
                + "\nDATA DE CADASTRO: " + natan.getDataCadastro());
        
        
        Cliente jose = new Cliente();
        jose.setCodigo(2);
        jose.setNome("Jose");
        jose.setDataCadastro("02-04-2025");
        jose.setEmail("jose.email@cliente.org.br");
        jose.setEndereco("Rua Italia, 1884 - Nacoes, Patrocinio-MG");
        jose.setTelefone("(34) 9 9987-5682");
        System.out.println("\n****CLIENTE****"
                + "\nCODIGO: " + jose.getCodigo()
                + "\nNOME: " + jose.getNome()
                + "\nDATA DE CADASTRO: " + jose.getDataCadastro()
                + "\nEMAIL: " + jose.getEmail()
                + "\nENDERECO: " + jose.getEndereco()
                + "\nTELEFONE: " + jose.getTelefone());

        
        Usuario maria = new Usuario();
        maria.setCodigo(3);
        maria.setNome("Maria");
        maria.setDataCadastro("01-04-2023");
        maria.setLogin("maria");
        maria.setSenha("Maria123");
        System.out.println("\n****USUARIO****"
                + "\nCODIGO: " + maria.getCodigo()
                + "\nNOME: " + maria.getNome()
                + "\nDATA DE CADASTRO: " + maria.getDataCadastro()
                + "\nLOGIN: " + maria.getLogin()
                + "\nSENHA: " + maria.getSenha());
        
    }
}
