package aulaconstrutor;

/**
 *
 * @author Natan
 */

/*
construtores que inicializa
sao metodos que inicializam a classe
construtores possuem visibilidade nome identico ao da classe 
e podem conter ou nao parametros
-Quando implmentar um

*/
public class Professor {
    
    private String nome;
    private String departamento;
        
    public Professor (String nome){
        this.nome = nome;
        if(nome.equals(" ")){
            this.nome = "sem nome";
        }
        this.departamento = "Gestao Administrativa";
    }
    
    public Professor (String nome, String departamento){
        this.nome = nome;
        if(nome.equals(" ")){
            this.nome = "sem nome";
        }
        this.departamento = departamento;
    }
          
    public Professor (){
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
